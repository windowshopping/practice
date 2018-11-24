
public class countPalindromeSubstrings {
	static int l=0;
	static String f="";
	
	public static void main(String args[]) {
		String a="aba";
		countPalindromeSubstring(a);
		System.out.println(l);
	}

	public static int countPalindromeSubstring(String s){
		l=s.length();int left=0,right=0,mid=0;
		char str[]=s.toCharArray();
		for(mid=1;mid<s.length()-1;mid++) {
			left=mid-1;//System.out.println(left+"hiuhi");
			right=mid+1;//System.out.println(right+"r");
			while(left>0||right<s.length()) {
				if(left<0||right>s.length()||str[left]!=str[right]) {
					break;
				}
				if(str[left]==str[right]) {
					l++;//System.out.println(left+"hiuhi");
					left--;//System.out.println(right);
					right++;
				}
				
			}
		}
		for(mid=0;mid<s.length()-1;mid++) {
			if(str[mid]==str[mid+1]) {
					l++;
					left=mid-1;
					right=mid+2;
					if(left<0||right>s.length()) {
						continue;
					}
					else {
						while(left>0||right<s.length()) {
							if(left<0||right>s.length()||str[left]!=str[right]) {
								break;
							}
							if(str[left]==str[right]) {
								l++;
								left--;
								right++;
							}
						}
					}
				}
			else{
				continue;
			}
		}
		return l;
	}
}