
public class geometricsum_recursion {
	public static void main(String[] args) {
		int k=0;
		double b=findGeometricSum(k);
		System.out.println(b);
		
	}
	static float i=1;
	static int n=1;
	static int m=0;
	static float f=0;
	public static double findGeometricSum(int k){
		if (k==0&&m==0) {
		 return 1;	
		}
		if(k==0&&m==1) {
			return i;
		}
		m=1;
		n=n*2;
		f=1/(float)n;
		
		i=i+(f);
		
		//System.out.println(i);
		return findGeometricSum(k-1);
	}
}
