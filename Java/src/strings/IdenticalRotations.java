package strings;
/**
* Calculate how many rotations of a string is same as the original string.
* Class owner: Faisal Rahman
* Class contributors: Faisal Rahman
**/
public class IdenticalRotations {
	private String s;
	public IdenticalRotations(String s){
		this.s=s;
	}
	public int count(){
		if(s=="") return 1;
		int []hash= new int[256];
		int max=0;
		for(int i=0;i<s.length();i++){
			hash[s.charAt(i)]++;
		}
		max=hash[s.charAt(0)];
		for(int i=1;i<s.length();i++){
			if(max!=hash[s.charAt(i)])
				return 1;
		}
		return max;
	}
}
