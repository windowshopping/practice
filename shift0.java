
public class shift0 {
	public static void main(String args[]) {
		int[] arr= {1,0,0,2,0,3,4,5};
		pushZerosAtEnd(arr);
	}
	public static void pushZerosAtEnd(int[] arr){
		int[] b=new int[arr.length];
		int j=0,k=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				b[j++]=arr[i];
			}
			else if(arr[i]==0) {
				k++;
			}
		}		
		for(int i=k;i>0;i--) {
			b[j++]=0;
		}
		for(int i=0;i<b.length;i++) {
			arr[i]=b[i];
		}
		
	}
}
