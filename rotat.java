
public class rotat {
	public static void main(String args[]) {
		int[][] input = new int[][]{
			  {1,2,3,4},
			  {7,6,8,9},
			  {10,11,12,13},
			  {0,1,2,3}
			};
			rotate(input);
			for(int i=0;i<4;i++) {
				for(int j=0;j<4;j++) {
					System.out.print(input[i][j]+" ");
				}
				System.out.println("");
			}
	}
	public static void rotate(int[][] matrix) {
		int n=matrix.length;
		for (int layer = 0; layer < n / 2; ++layer) {
			int first = layer;
			int last = n - 1 - layer;
			for(int i = first; i < last; ++i) {
			int offset = i - first;
		
			int top =matrix[last-offset][first];
			//System.out.println(matrix[i][last]);
			matrix[last-offset][first]=matrix[first][i];
			matrix[first][i]=matrix[i][last];
			matrix[i][last]=matrix[last][last - offset];
			
			
	
			matrix[last][last - offset] = top;
			
			}
			
			}
	}
}
