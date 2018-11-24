import java.util.HashMap;

public class Equal_Sum_Pair_hashmap {
	public static void main(String[] args) {
		int [] a= {9, 8, 17, 20, 30, 40}; 
		boolean am=findPairs(a);System.out.println(am);
	}
	public static boolean findPairs(int[] arr){
      HashMap<Integer,Boolean> h=new HashMap<>();
      for(int i=0;i<arr.length-1;i++) {
    	  for(int j=i+1;j<arr.length;j++) {
    		  if(h.containsKey(arr[i]+arr[j])) {
    			 return true;
    		  }else {
    			  h.put((arr[i]+arr[j]), true);
    		  }
    	  }
      }
      return false;
	}
}
