
public class knj {
	public static void main(String args[]) {
		String input="this is me";
		String a=new String();
		reverseEachWord(input);
		//System.out.print(a);
    }
	public static String reverseEachWord(String input) {
		// Write your code here
		//int space= 32;
		//String m="";
		String p="";
		char[] a=new char[input.length()];
		char [] arr=input.toCharArray();
		for(String n:input.split(" ")) {
			//System.out.print(n);
			//int j=0;
			String m="";
			for(int i=n.length()-1;i>=0;i--) {
				//a[j]=n.charAt(i);
				m=m+n.charAt(i);
				//System.out.print(a[j]);
				//j++;
			}
			p=p+m+" ";
			
			
		}
		//System.out.print(p);
		
		return p;

	}
}


