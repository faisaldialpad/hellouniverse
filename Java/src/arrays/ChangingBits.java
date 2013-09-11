package arrays;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class ChangingBits {
	int []a;
	int []b;
	int N;
	public ChangingBits(int N,String _a,String _b) {
		this.N=N;
		a=new int[(int)(N/32)+1];
		b=new int[(int)(N/32)+1];
		for(int i=0;i<N;i++){
			int idx=i/32;
			int off=i%32;
			if(_a.charAt(i)=='1'){
				a[idx]|= (1<<off);
			}
			if(_b.charAt(i)=='1'){
				b[idx]|= (1<<off);
			}
		}
	/*	for(int i=0;i<N;i++){
			if(a[i]!=0 && a[i]!=1 )
			System.out.print(a[i]);
		}
		System.out.println("");
		for(int i=0;i<N;i++){
			if(b[i]!=0 && b[i]!=1 )
			System.out.print(b[i]);
		}
		System.out.println("");*/
	}
	public void set_a(int idx,int x){
		//System.out.print(a[idx]);
		if(x==1)
			a[idx/32]|=(1<<(idx%32));
		else
			a[idx/32]&=((~0)<<(idx%32+1));
	}
	public void set_b(int idx,int x){
		//System.out.print(b[idx]);
		if(x==1)
			b[idx/32]|=(1<<(idx%32));
		else
			b[idx/32]&=((~0)<<(idx%32+1));
	}
	
	public int get_c(int idx){
		int idx1=idx/32;
		int idx2=idx%32;
		int mask=1<<idx2;
		if(idx==N) return getCarry(N-1);
		int sum=getCarry(idx-1)+((a[idx1]&mask)==0?0:1)+((b[idx1]&mask)==0?0:1);
		switch(sum){
			case 2: return 0;
			case 3: return 1;
			default: return sum;
		}
	}
	public int getCarry(int idx){
		if(idx<0) return 0;
		int idx1=idx/32;
		int idx2=idx%32;
		while(idx1>=0){
			while(idx2>=0){
				int mask=1<<idx2;
				if((a[idx1]&mask)!=0 &&  (b[idx1]&mask)!=0 ) return 1;
				else if((a[idx1]&mask)==0 &&  (b[idx1]&mask)==0 ) return 0;
				idx2--;
			}
			idx1--;
		}
		return 0;
	}
	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		final long startTime = System.currentTimeMillis();
	  	System.setIn(new FileInputStream("/Users/rfaisal/github/hellouniverse/Java/src/arrays/myinput.txt"));
		Scanner in = new Scanner(System.in);
        int N=in.nextInt();
        int Q=in.nextInt();
        String a=in.next();
        String b=in.next();
        ChangingBits cb=new ChangingBits(N, a, b);
        for(int i=0;i<Q;i++){
        	String func=in.next();
        	if(func.equals("set_a")){
        		cb.set_a(in.nextInt(), in.nextInt());
        	}
        	else if(func.equals("set_b")){
        		cb.set_b(in.nextInt(), in.nextInt());
        	}
        	else{
        		System.out.print(cb.get_c(in.nextInt()));
        	}
        }
		final long endTime = System.currentTimeMillis();
		System.out.println("\nTotal execution time: " + (endTime - startTime) );

	}

}
