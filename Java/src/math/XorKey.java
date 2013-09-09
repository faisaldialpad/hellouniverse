package math;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;



public class XorKey {
	class TreeNode{
	    public int data;
	    public TreeNode left=null;
	    public TreeNode right=null;
	    public TreeNode (){
	    }
	}
	int []arr;
	public XorKey(int[] arr) {
		this.arr= arr;
	}
	public int maxForXorqOpt(int a,int p, int q){
		TreeNode root = new TreeNode();//dummy
		TreeNode cur;
		int mask;
		for(int i=p;i<=q;i++){
			cur=root;
			mask=1<<16;
			for(int k=0;k<17;k++){
				if((arr[i]&mask)==0){
					if(cur.left==null)
						cur.left=new TreeNode();
					cur=cur.left;
				}else{
					if(cur.right==null)
						cur.right=new TreeNode();
					cur=cur.right;

				}
				mask>>=1;
			}
			cur.data=arr[i];
		}
		cur=root;
		mask=1<<16;
		for(int k=0;k<17;k++){
			if((a&mask)==0){
				if(cur.right!=null)
					cur=cur.right;
				else
					cur=cur.left;
			}else{
				if(cur.left!=null)
					cur=cur.left;
				else
					cur=cur.right;
			}
			mask>>=1;
		}
		return cur.data^a;
	}
	public int maxForXorq(int a,int p, int q){
		int max=a^arr[p];
		for(int i=p+1;i<=q;i++){
			if((a^arr[i])>max) max=a^arr[i];
		}
		return max;
	}
	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		final long startTime = System.currentTimeMillis();
	   	System.setIn(new FileInputStream("/Users/rfaisal/github/hellouniverse/Java/src/math/input.txt"));
		Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        while(t>0){
	        int n=in.nextInt();
	        int Q=in.nextInt();
	        int []arr= new int[n];
	        for(int i=0;i<n;i++){
	        	arr[i]=in.nextInt();
	        }
	        XorKey xk=new XorKey(arr);
	        for(int i=0;i<Q;i++){
	        	int a=in.nextInt();
	        	int p=in.nextInt()-1;
	        	int q=in.nextInt()-1;
	        	System.out.println(xk.maxForXorqOpt(a,p,q));
	        	System.out.println(t+" "+i);
	        }
	        t--;
        }
		final long endTime = System.currentTimeMillis();
		System.out.println("Total execution time: " + (endTime - startTime) );
	}

}
