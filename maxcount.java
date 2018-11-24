//<coudnt>
public class maxcount {
	public static void main(String args[]) {
		int[] a= {1, 5 ,10, 15, 20 ,25};
		int[] b= {2, 4, 5, 9, 15};
		long c=maximumSumPath(a, b);
		System.out.println(c);
	}
	public static long maximumSumPath(int[] input1, int[] input2) {
		long count=0;
		int i=0,j=0, sum1=0,sum2=0;
		while(i!=input1.length&&j!=input2.length) {
			if(input1[i]<input2[j]) {
				sum1+=input1[i];
				System.out.println("i"+i+":"+sum1);
				i++;
			}
			if(input1[i]>input2[j]) {
				sum2+= input2[j];
				System.out.println("j"+j+":"+sum2);
				j++;
			}
			else if(input1[i]==input2[j]) {
				sum1+=input1[i];
				sum2+=input2[j];
				if(sum1>sum2) {
					count+=sum1;System.out.println("c"+count+":sum1:"+sum1);
				}
				else {
					count+=sum2;
					System.out.println("c"+count+":sum2:"+sum2);
				} 
			sum1=0;sum2=0;i++;j++;
			}
		}
		while(i<input1.length) {
			sum1+=input1[i++];
		}
		while(j<input2.length) {
			sum2+=input2[j++];
		}
		count+=Math.max(sum1, sum2);
		return count;
	}
}
