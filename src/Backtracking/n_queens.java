
package Backtracking;

import java.util.*;

public class n_queens {

	// https://www.pepcoding.com/resources/online-java-foundation/recursion-backtracking/flood-fill-official/ojquestion
	// https://www.pepcoding.com/resources/online-java-foundation/recursion-backtracking/n-queens-official/ojquestion
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] chess = new int[n][n];
		printNQueens(chess, "", 0);
	}

	public static void printNQueens(int[][] chess, String asf, int row) {
		if (row == chess.length) {
			System.out.println(asf + ".");
			return;
		}

		for (int col = 0; col < chess[0].length; col++) {
			if (isItSafe(chess, row, col)) {
				chess[row][col] = 1;
				printNQueens(chess, asf + row + "-" + col + ", ", row + 1);
				chess[row][col] = 0;
			}
		}

	}

	public static boolean isItSafe(int[][] chess, int row, int col) {
		for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
			if (chess[i][j] == 1) {
				return false;
			}
		}
		for (int i = row - 1, j = col; i >= 0; i--) {
			if (chess[i][j] == 1) {
				return false;
			}
		}
		for (int i = row - 1, j = col + 1; i >= 0 && j < chess[0].length; i--, j++) {
			if (chess[i][j] == 1) {
				return false;
			}
		}
		return true;

	}

}