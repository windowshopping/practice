import java.util.*;
public class intersection_hash {
	public static void main(String args[]) {
		int [] a= {2};
		int [] b= {2, 2,6, 8, 5, 4, 3};
		intersection(a,b);
	}
	public static void intersection(int[] arr1, int[] arr2){
		HashMap<Integer,Integer> hm=new HashMap<>();
		if(arr1.length>arr2.length) {
		for(int i=0;i<arr1.length;i++) {
			if(hm.get(arr1[i])!=null) {
				hm.put(arr1[i],hm.get(arr1[i])+1);
			}
			else {
				hm.put(arr1[i],1);
			}
		}
		for(int i=0;i<arr2.length;i++) {
			if(hm.containsKey(arr2[i])) {
				System.out.println(arr2[i]);
			}
		}
		}
		else {
			for(int i=0;i<arr2.length;i++) {
				if(hm.get(arr2[i])!=null) {
					hm.put(arr2[i],hm.get(arr2[i])+1);
				}
				else {
					hm.put(arr2[i],1);
				}
			}
			for(int i=0;i<arr1.length;i++) {
				if(hm.containsKey(arr1[i])) {
					System.out.println(arr1[i]);
				}
			}
		}
		//for(Map.Entry en:hm.entrySet()) {
			//System.out.println(en.getKey()+":"+en.getValue());
		//}
	}

}
