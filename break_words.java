
public class break_words {
	public static void main(String args[]) {
		int[] a= {13, 17, 5, 3, 2};
		leaders(a);
		//System.out.print(b);
	}
	public static void leaders(int[] input){
	    int k=0;
	    for(int i=0;i<input.length-1;i++) {
	    	k=0;
	    	for(int j=i;j<input.length;j++) {
	    	
	    		if(input[i]<input[j]) {
	    			break;
	    		}
	    		else {
	    			k++;
	    		}
	    	}
	    	if(k==input.length-i) {
	    		System.out.print(input[i]+" ");
	    	}
	    }
	  System.out.print(input[input.length-1]);  
    }
}
