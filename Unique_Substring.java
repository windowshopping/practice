
public class Unique_Substring {
	static String l="";
	static String f="";
	
	public static void main(String args[]) {
		String a="ababcde";
		findLargestUniqueSubstring(a);
		System.out.println(l);
	}

	public static String findLargestUniqueSubstring(String str){
		int c[]=new int[256];
		//String f="";
		char s[]=str.toCharArray();
		for(int i=0;i<256;i++) {
			c[i]=0;
		}
		int t=0;
		for(int j=0;j<str.length();j++) {
			flush(c,f);
			f="";
			System.out.println("j"+j);
			for(int i=j;i<str.length();i++) {
				System.out.println("i"+i+" c"+c[s[i]]);
				if(c[s[i]]==1) {
				//System.out.println(f);
				//flush(c,f);
				//f="";
				break;
				
				}
				else if(c[s[i]]==0) {
				c[s[i]]++;
				f=f+s[i];
				//System.out.print(f);
				}
				//System.out.println("");
			}
		}
		
		return l;
	}
	static void flush(int[] c,String f) {
		for(int m=0;m<256;m++) {
			c[m]=0;
		}
		
		if(l.length()<=f.length()) {
			//System.out.println(l);
			l=f;
			
		}
	}
	
}
