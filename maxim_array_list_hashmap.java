import java.util.HashMap;
import java.util.*;

public class maxim_array_list_hashmap {
	public static void main(String args[]) {
		int[] a= {0,0,0,1,1,1,1};
		int b=maxFrequencyNumber(a);
		System.out.println(b);
	}
	public static int maxFrequencyNumber(int[] arr){
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>(); 
		 int i=0;
		 for(int j=0;j<arr.length;j++) {
			  hm.put(arr[i], 0);
			  i++;
		  }
		  for(i=0;i<arr.length;i++){
			  int value=hm.get(arr[i]);
			  value++;
			  hm.put(arr[i], value);
			  
		  }
		  int max=0;
		  int b=arr[0];
		  i=0;
		  for(int j=0;j<arr.length;j++) {
			  //System.out.println(entry.getValue()+": "+entry.getKey());
			 
			  //System.out.println(hm.get(arr[i])+" "+max+" "+b+" "+i);
			  if(hm.get(arr[3])>max) {
				  max=hm.get(arr[i]);
				  b=arr[i];
			  }
			  i++;
			 
			  //System.out.println(b);
		  }
		return b;
	}
}
