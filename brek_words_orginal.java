
public class brek_words_orginal {
	public static void main(String args[]) {
		String a="Helloo world good morniing";
		breakWords(a);
		//System.out.print(a.length());
	}
	public static String breakWords(String input){
		int a=0,first=0,space=0,newlength=0;
		for(int i=0;i<input.length();i++) {
			if(input.charAt(i)==' ') {
				a=i-first;//System.out.print(a);
				if(a%2==0&&a>=4) {
					space++;
				}
				first=i+1;
			}
			else if(i==input.length()-1) {
				a=i-first+1;
				if(a%2==0&&a>=4) {
					space++;
				}
			}
		}
		newlength=input.length()+space;
		int i=3,j=input.length()-1;
		while(i>=0) {
			int f=j;
			while(input.charAt(j)!=' '&&j>=0) {
				j--;
			}
			a=i-j;
			//System.out.println(i+" "+j);
			if(a%2==0&&a>=4) {
				for(int k=f;k>a/2+j;k--) {
					char c;
					c=input.charAt(k);
					//input.charAt(newlength)=c;
				}
			}
			i--;;
			
		}
		return input;
	}
}	
