import java.util.*;
public class sum_zero_hashmap {
	public static void main(String args[]) {
		int[] a= {2, 1, -2, 2,2,2,2,-3,-1, 3};
		PairSum(a, a.length);
	}
	public static void PairSum(int[] input, int size) {
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		for(int i=0;i<input.length;i++) {
			if(hm.get(input[i])!=null) {
				hm.put(input[i],hm.get(input[i])+1);
			}
			else {
				hm.put(input[i],1);
			}
		}
		for(int i=0;i<input.length;i++) {
			if(hm.containsKey(-input[i])&&hm.get(input[i])>0&&hm.get(-input[i])>0) {
				 
					for(int j=0;j<hm.get(input[i])*hm.get(-input[i]);j++) {
						if(input[i]<(-input[i])) {
							System.out.println(input[i]+" "+(-input[i]));
							hm.put(input[i], hm.get(input[i])-1);
						}
						else {
							System.out.println(-input[i]+" "+(input[i]));
							hm.put(input[i], hm.get(input[i])-1);
						}
					}
				
			}
		}

	}
}
