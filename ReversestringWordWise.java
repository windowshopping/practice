
public class ReversestringWordWise {
	public static void main(String args[]) {
		String input= "this is me";
		reverseWordWise(input);
	}
	public static String reverseWordWise(String input) {
		// Write your code here
		String nono="";
		for(int i=input.length()-1;i>=0;i--) {
			nono=nono+input.charAt(i);
			
		}
		String p="";
		char[] a=new char[nono.length()];
		char [] arr=nono.toCharArray();
		for(String n:nono.split(" ")) {
			String m="";
			for(int i=n.length()-1;i>=0;i--) {
				
				m=m+n.charAt(i);
				
			}
			p=p+m+" ";
			
			
		}
		//System.out.print(p);
		return p;
	}

}
