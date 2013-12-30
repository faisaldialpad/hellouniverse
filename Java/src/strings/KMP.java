package strings;

/**
 * Take a look at http://en.wikipedia.org/wiki/Knuth%E2%80%93Morris%E2%80%93Pratt_algorithm for the variable names.
 * @author frahman
 *
 */
public class KMP {
	public static int search(String s, String w){
		char[] S=s.toCharArray();
		char[] W=w.toCharArray();
		int m=0;
		int i=0;
		int []T=getKMPtable(W);
		while(m+i<S.length){
			if(W[i]==S[m+i]){
				if(i==W.length-1) return m;
				i++;
			}
			else{
				m=m+i-T[i];
				if(T[i]>-1){
					i=T[i];
				}
				else{
					i=0;
				}
			}
		}
		return S.length;
	}
	public static int[] getKMPtable(char[] W){
		int[] T= new int[W.length];
		if(W.length>=1) T[0]=-1;
		if(W.length>=2) T[1]=0;
		int c=0;
		int p=2;
		while(p<W.length){
			if(W[p-1]==W[c]){
				c++;
				T[p]=c;
				p++;
			}
			else if(c>0){
				c=T[c];
			}
			else{
				T[p]=0;
				p++;
			}
		}
		return T;
	}
}
