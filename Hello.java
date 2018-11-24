import java.util.ArrayList;

//import java.util.Arrays;

public class Hello {
	

	
	public static void main(String args[]) {
		String inputString="hahahah";
		char a[]=inputString.toCharArray();
		//char[] b=new char[a.length];
      	int z=a.length;
		int[] c= new int[256];
		ArrayList<String> ar = new ArrayList<String>();
		for(int i=0;i<256;i++) {
			c[i]=0;
		}
		for(int i=0;i<z;i++) {
			c[a[i]]++;
			//System.out.print(c[a[i]]);
			//System.out.print(" ");
		}
		int j=0; String m;
      	for(int i=0;i<256;i++){
          if(c[i]!=0&&c[i]!=1){
        	  
        	  ar.add("c[i]");
        	  
        	//b[j]=(char)i;
            //b[j+1]=c[i];
            //System.out.print(b[j]+""+c[i]);
            //j++;
          }
         // if(c[i]==1){
        	//  a[i]=(char)i;
              //a[i+1]=(char)c[i];
          //}
        }
      	for(int i=0;i<a.length;i++) {
      		//System.out.print(a[i]+ " ");
      	}
	}
	
	
	/*2......public static void main(String args[]) {
		int arr[]= {0,1,2,0,1,2};
		sort012(arr);
	}
	public static void sort012(int[] arr){
		//char[] a= s.toCharArray();
		int z=arr.length;
		int[] c= new int[3];
		//char[] b=new char[z];
		int b[]=new int[z];
		for(int i=0;i<3;i++) {
			c[i]=0;
		}
		for(int i=0;i<z;i++) {
			c[arr[i]]++;
		}
		for(int i=1;i<3;i++) {
			c[i]=c[i]+c[i-1];
		}
		for(int i=0;i<arr.length;i++) {
			b[c[arr[i]]-1]=arr[i];
			c[arr[i]]--;
			//System.out.print(b[i]);
		}
		for(int i=0;i<arr.length;i++) {
			arr[i]=b[i];
		}
		//return b;
	}*/ 
}
