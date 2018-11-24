
public class Interleavings_recursion {
	public static void main(String[] args) {
		interleavings("ab", "de");
	}
	public static void interleavings(String first, String second, String ans){ 
		if(first.length() == 0 && second.length() == 0){
			System.out.println(ans);
			return;
			}
		if(first.length() != 0 ){ //System.out.println(":"+ans);
			interleavings(first.substring(1), second, ans + first.charAt(0)); 
			}
		if(second.length() != 0){// System.out.println(":/"+ans);
			interleavings(first, second.substring(1), ans + second.charAt(0));
			
			}
		}
	public static void interleavings(String first, String second){ 
		interleavings(first, second, "");
		}
}
