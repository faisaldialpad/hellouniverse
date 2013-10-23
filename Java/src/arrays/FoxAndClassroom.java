package arrays;

import java.awt.Point;
import java.util.HashSet;

public class FoxAndClassroom {
	public static String ableTo(int m, int n){
		HashSet<Point> overallVisited=new HashSet<Point>();
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				Point cur=new Point(i,j);
				if(!overallVisited.contains(cur)){
					HashSet<Point> visited=new HashSet<Point>();
					while(!visited.contains(cur) && visited.size() < m*n){
						visited.add(cur);
						cur=next(cur,m,n);
					}
					if(visited.size() == m*n){
						return "Possible";
					}
					overallVisited.addAll(visited);
				}
			}
		}
		return "Impossible";
	}
	public static String ableTo_slow(int m, int n){
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				Point cur=new Point(i,j);
				HashSet<Point> visited=new HashSet<Point>();
				while(!visited.contains(cur) && visited.size() < m*n){
					visited.add(cur);
					cur=next(cur,m,n);
				}
				if(visited.size() == m*n){
					return "Possible";
				}
			}
		}
		return "Impossible";
	}
	private static Point next(Point cur, int m, int n){
		return new Point((cur.x+1)%m,(cur.y+1)%n);
	}
}
