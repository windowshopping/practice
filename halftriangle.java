import java.util.*;
public class halftriangle {
public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
	Scanner reader = new Scanner(System.in);  // Reading from System.in

		//int n = reader.nextInt();
		int n=3;
		for(int i=1;i<=n;i++) {
			for(int j=0;j<n-i;j++) {
				System.out.print(" ");
			}
			int m=i-1;
			for(int k=0;k<i;k++) {
				m++;
				System.out.print(m);
			}
          System.out.println("");
        }
	}
}
