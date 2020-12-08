package Backtracking;

import java.*;
import java.util.Scanner;

public class knight_Tour {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int n = sc.nextInt();
		int row = sc.nextInt();
		int col = sc.nextInt();

		knightTour(n, row, col, new int[n][n], 1);

	}

	private static void knightTour(int n, int row, int col, int[][] chess, int count) {
		if (row < 0 || col < 0 || row >= n || col >= n) {
			return;
		}
		if (chess[row][col] != 0) {
			return;
		}
		if (count == n * n) {
			chess[row][col] = n * n;
			display(chess);
			chess[row][col] = 0;
			return;
		}

		chess[row][col] = count;
		knightTour(n, row - 2, col + 1, chess, count + 1);
		knightTour(n, row - 1, col + 2, chess, count + 1);
		knightTour(n, row + 1, col + 2, chess, count + 1);
		knightTour(n, row + 2, col + 1, chess, count + 1);
		knightTour(n, row + 2, col - 1, chess, count + 1);
		knightTour(n, row + 1, col - 2, chess, count + 1);
		knightTour(n, row - 1, col - 2, chess, count + 1);
		knightTour(n, row - 2, col - 1, chess, count + 1);
		chess[row][col] = 0;
	}

	private static void display(int[][] chess) {

		for (int i = 0; i < chess.length; i++) {
			for (int j = 0; j < chess[0].length; j++) {
				System.out.print(chess[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();

	}

}
