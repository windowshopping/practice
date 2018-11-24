
public class Sodoku_recursion {
	public static void main(String[] args) {
		int[][] a = { { 9, 0, 0, 0, 2, 0, 7, 5, 0 }, { 6, 0, 0, 0, 5, 0, 0, 4, 0 }, { 0, 2, 0, 4, 0, 0, 0, 1, 0 },
				{ 2, 0, 8, 0, 0, 0, 0, 0, 0 }, { 0, 7, 0, 5, 0, 9, 0, 6, 0 }, { 0, 0, 0, 0, 0, 0, 4, 0, 1 },
				{ 0, 1, 0, 0, 0, 5, 0, 8, 0 }, { 0, 9, 0, 0, 7, 0, 0, 0, 4 }, { 0, 8, 2, 0, 4, 0, 0, 0, 6 } };
		boolean m=sudokuSolver(a);
		System.out.println(m);
	}

	public static boolean sudokuSolver(int board[][]) {
		int x=-1,y=-1,flag=0;
		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) {
				if(board[i][j]==0) {
					x=i;
					y=j;
					flag=1;
					break;
				}
			}
			if(flag==1) {
				break;
			}
		}
		if (x==-1) {
			return true;
		}
		for(int k=1;k<=9;k++) {
			if(check(board,k,x,y)) {
				board[x][y]=k;
				if(sudokuSolver(board)) {
					return true;
				}
				board[x][y]=0;
			}
		}
		return false;
	}
	private static boolean check(int [][] board, int k,int x,int y) {
		int row=0,col=0,mat=0;
		if(check_row(board,k,x,y)) {
			row=1;
		}
		if(check_col(board,k,x,y)) {
			col=1;
		}
		if(check_mat(board,k,x,y)) {
			mat=1;
		}
		if(row==1&&col==1&&mat==1) {
			return true;
		}
		return false;
	}
	private static boolean check_row(int [][] board, int k,int x,int y) {
		for(int i=0;i<9;i++) {
			if(board[x][i]==k) {
				return false;
			}
		}
		return true;
	}
	private static boolean check_col(int [][] board, int k,int x,int y) {
		for(int i=0;i<9;i++) {
			if(board[i][y]==k) {
				return false;
			}
		}
		return true;
	}
	private static boolean check_mat(int [][] board, int k,int x,int y) {
		for(int i=x-x%3;i<(x-x%3)+3;i++) {
			for(int j=y-y%3;j<(y-y%3)+3;j++) {
				if(board[i][j]==k) {
					return false;
				}
			}
		}
		return true;
	}
}
