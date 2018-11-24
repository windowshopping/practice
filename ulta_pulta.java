
public class ulta_pulta {
	public static void main(String args[]) {
		int n=4;
		for(int i=0;i<n;i++) {
			int m=1;
			for(int j=0;j<i+1;j++) {
				System.out.print(m);
				m++;
			}
			for(int j=n-i-1;j>0;j--) {
				System.out.print("*");
			}
			for(int j=n-i-1;j>0;j--) {
				System.out.print("*");
			}
			for(int j=0;j<i+1;j++) {
				m--;
				System.out.print(m);
			}
			System.out.println("");
		}
	}
}
