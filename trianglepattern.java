import java.util.*;
public class trianglepattern {
	public static void main(String args[]) {
		
		Scanner reader = new Scanner(System.in);  // Reading from System.in

		int n = reader.nextInt();
		//int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=0;j<n-i;j++) {
				System.out.print(" ");
			}
			int m=i-1;
			for(int k=0;k<i;k++) {
				m++;
				System.out.print(m);
			}
			if(i>1) {
				for(int k=0;k<i-1;k++) {
				m--;
				System.out.print(m);
				}
			}
			System.out.println("");
		}
	}
}
