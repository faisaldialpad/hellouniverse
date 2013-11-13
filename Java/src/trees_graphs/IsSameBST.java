package trees_graphs;

public class IsSameBST {
	public static boolean calculate(int []a, int []b){
		return calculateRecursive(a, b, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}
	private static boolean calculateRecursive(int []a,int []b, int i_a, int j_b, int min, int max){
		int i;
		int j;
		for(i=i_a;i<a.length;i++)
			if(a[i]>min && a[i]<max) break;
		for(j=j_b;j<b.length;j++)
			if(b[j]>min && b[j]<max) break;
		if(i==a.length && j==b.length) //if does not hit the break then i is now a.length
			return true;
		else if(i==a.length || j==b.length)
			return false;
		else 
			return a[i]==b[j] && calculateRecursive(a,b,i+1,j+1,min,a[i]) && calculateRecursive(a,b,i+1,j+1,a[i],max);
	}
	public static boolean calculateSlow(int []a, int []b){
		if(a.length==0 && b.length==0) return true;
		else if(a.length==0 || b.length==0) return false;
		else return a[0]==b[0]&&calculateSlow(getBiggerElements(a,a[0]),getBiggerElements(b,b[0]))&&calculateSlow(getSmallerElements(a,a[0]),getSmallerElements(b,b[0]));
	}
	private static int[] getBiggerElements(int []a,int n){
		int count=0;
		for(int e:a){
			if(e>n) count++;
		}
		int []ret= new int[count];
		int i=0;
		for(int e:a){
			if(e>n) ret[i++]=e;
		}
		return ret;
	}
	private static int[] getSmallerElements(int []a,int n){
		int count=0;
		for(int e:a){
			if(e<n) count++;
		}
		int []ret= new int[count];
		int i=0;
		for(int e:a){
			if(e<n) ret[i++]=e;
		}
		return ret;
	}
}
