
public class Flags {
	static int a=0;
	public static void main(String[] args) {
		fla(1,'b','s');
		System.out.println(a);
	}
	private static void fla(int n, char p, char pp) {
		// TODO Auto-generated method stub
		if(n==1&&pp=='s') {
			a=2;
			return;
		}
		if(n==1) {
			a++;
			return;
		}
		if(pp=='s') {
			fla(n-1,'w','b');
			fla(n-1,'r','b');
		}
		else if(pp=='w'&&p=='b') {
			fla(n-1,'r','b');
		}
		else if(pp=='r'&&p=='b') {
			fla(n-1,'w','b');
		}
		else if(p=='r') {
			fla(n-1,'w','r');
			fla(n-1,'b','r');
		}
		else if(p=='w') {
			fla(n-1,'b','w');
			fla(n-1,'r','w');
		}
		
	}
	
}
