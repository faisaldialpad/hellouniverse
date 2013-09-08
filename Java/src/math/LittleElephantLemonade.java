package math;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class LittleElephantLemonade {
	private int drunkVolume;
	private ArrayList<PriorityQueue<Integer>> rooms;
	public LittleElephantLemonade() {
		drunkVolume=0;
		rooms=new ArrayList<PriorityQueue<Integer>>();
	}
	public int getDrunkVolume(){
		return drunkVolume;
	}
	public void populateRoom(int roomIndex, ArrayList<Integer>volumes){
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>(volumes.size(),new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2-o1;
			}
		});
		pq.addAll(volumes);
		rooms.add(roomIndex, pq);

	}
	public void visitRoom(int roomIndex){
		if(!rooms.get(roomIndex).isEmpty())
			drunkVolume+=rooms.get(roomIndex).poll();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );
		int t=scanner.nextInt();
		for(int i=0;i<t;i++){
			LittleElephantLemonade lel= new LittleElephantLemonade();
			int n=scanner.nextInt();
			int k=scanner.nextInt();
			int []visits= new int[k];
			for(int j=0;j<k;j++){
				visits[j]=scanner.nextInt();
			}
			for(int j=0;j<n;j++){
				ArrayList<Integer> volumes= new ArrayList<Integer>();
				int c=scanner.nextInt();
				for(int l=0;l<c;l++)
					volumes.add(scanner.nextInt());
				lel.populateRoom(j, volumes);
			}
			for(int j=0;j<k;j++){
				lel.visitRoom(visits[j]);
			}
			System.out.println(lel.getDrunkVolume());
		}

	}

}
