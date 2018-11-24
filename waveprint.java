
public class waveprint {
	public static void main(String args[]) {
		int[][] input = new int[][]{
			  {1,2,3,4},
			  {7,6,8,9},
			  {10,11,12,13},
			  {0,1,2,3}
			};
			//System.out.println(input[0].length);
			wavePrint(input);
	}
	public static void wavePrint(int input[][]){
			int j=0;
			for(j=0;j<input[0].length;j++){
				
				for(int i=0;i<input.length;i++) {
					System.out.print(" "+input[i][j]);
				}
				j++;
				if(j<input.length) {
					for(int k=input.length-1;k>=0;k--) {
						System.out.print(" "+input[k][j]);
					}
				}
			}
	}

}
