import java.util.*;

public class pair_diff_hash {
	public static void main(String args[]) {
		int[] a={5,5,8,8,2,1,4,0,3,11};
		findPairsDifferenceK(a, 3);
	}
	public static void findPairsDifferenceK(int[] input, int k){
		HashMap<Integer, Integer> hm=new HashMap<Integer,Integer>();
		for(int i=0;i<input.length;i++) {
			if(hm.get(input[i])!=null) {
				hm.put(input[i],hm.get(input[i])+1);
			}
			else {
				hm.put(input[i],1);
			}
		}
		if(k>0) {
		for(int i=0;i<input.length;i++) {
			if(hm.containsKey(input[i]+k)&&hm.get(input[i])!=0) {
				int t=hm.get(input[i])*hm.get(input[i]+k);
				while(t!=0) {
					System.out.println(input[i]+" "+(input[i]+k));
					t--;
				}
			}
			if(hm.containsKey(input[i]-k)&&hm.get(input[i])!=0) {
				int t=hm.get(input[i])*hm.get(input[i]-k);
				while(t!=0) {
					System.out.println((input[i]-k)+" "+input[i]);
					t--;
				}
			}
			hm.put(input[i],0);
		}
	   }
		else if(k==0) {
			for(int i=0;i<input.length;i++) {
				if(hm.containsKey(input[i]+k)) {
					hm.put(input[i],hm.get(input[i])-1);
					int t=hm.get(input[i]);
					while(t!=0) {
						System.out.println(input[i]+" "+input[i]);
						t--;
					}
				}
				
			}
		}
	//
	}
}
