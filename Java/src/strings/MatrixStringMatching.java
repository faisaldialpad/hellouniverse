package strings;

import java.awt.Point;
import java.util.HashSet;

public class MatrixStringMatching {
	public static HashSet<Point> matchPattern(char[][] mat, String p){
		if(mat == null || (mat.length == 0)) return new HashSet<Point>();
		else{
			HashSet<Point> ret = new HashSet<Point>();
		    int p_l = p != null ? p.length() : 0;
		    for(int i=0;i<mat.length;i++){
		        for(int j=0;j<mat[i].length;j++){
		        	if(mat.length - i < p_l && mat[i].length - j < p_l) break;
		            boolean doesMatchRowForward = true;
		            boolean doesMatchRowBackward = true;
		            boolean doesMatchColumnForward = true;
		            boolean doesMatchColumnBackward = true;
		            for(int k=0;k<p_l;k++){
		            	doesMatchRowForward = doesMatchRowForward &&  //continue matching only if previous match is a success
		            			i+k <= mat.length -1  && //overflow
		            			p.charAt(k) == mat[i+k][j]; // match current char
		            	doesMatchRowBackward = doesMatchRowBackward && i+k <= mat.length -1 && p.charAt(p_l -1 - k) == mat[i+k][j];
		            	doesMatchColumnForward = doesMatchColumnForward && j+k <= mat[i].length -1 && p.charAt(k) == mat[i][j+k];
		            	doesMatchColumnBackward = doesMatchColumnBackward && j+k <= mat[i].length -1 && p.charAt(p_l -1 - k) == mat[i][j+k];
		                if(!doesMatchRowForward && 
				                !doesMatchRowBackward && 
				                    !doesMatchColumnForward && !doesMatchColumnBackward){ 
			            	break; // if all of them fails no need to continue, (it takes care of of the situation when you start matching only if the 1st char is a match) 
			            }
		            }
		            if(doesMatchRowForward || 
		                doesMatchRowBackward || 
		                    doesMatchColumnForward || doesMatchColumnBackward){ 
		                        ret.add(new Point(i,j)); // add if there is a match in atleast one direction
		            }
		            
		         }
		      }
		      return ret;
		}
		
	}
}
