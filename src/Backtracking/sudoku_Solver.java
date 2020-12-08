package Backtracking;

import java.util.*;

public class sudoku_Solver {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//https://www.pepcoding.com/resources/data-structures-and-algorithms-in-java-levelup/recursion-and-backtracking/solve-sudoku-official/ojquestion#
		int[][] arr = new int[9][9];
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		sudoSolver(arr, 0, 0);
	}

	private static void sudoSolver(int[][] arr, int i, int j) {
		if (i == arr.length ){
			display(arr);
			return;
		}

		int ni = 0;
		int nj = 0;
		if (j == arr[0].length - 1) {
			ni = i + 1;
			nj = 0;
		} else {
			ni = i;
			nj = j + 1;
		}
		 
		if (arr[i][j] != 0) {
			sudoSolver(arr, ni, nj);
		} else {
			for (int p = 1; p <= 9; p++) {
				if (isValid(arr, i, j, p)) {
					arr[i][j] = p;
					sudoSolver(arr, ni, nj);
					arr[i][j] = 0;
				}
			}
		}

	}

	private static boolean isValid(int[][] arr, int ni, int nj, int p) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length; i++) {
			if (arr[ni][i] == p) {
				return false;
			}
			if (arr[i][nj] == p) {
				return false;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[ni][i] == p) {
				return false;
			}
		}
		int subrow = 3 * (ni / 3);
		int subcol = 3 * (nj / 3);
		for (int i = subrow; i < subrow + 3; i++) {
			for (int j = subcol; j < subcol + 3; j++) {
				if (arr[i][j] == p) {
					return false;
				}
			}
		}

		return true;
	}

	public static void display(int[][] board) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
	}

}
