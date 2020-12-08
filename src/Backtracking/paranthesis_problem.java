package Backtracking;

import java.util.*;

public class paranthesis_problem {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int row = 0;
		int nspb = 1, nstb = 1, nspa = n / 2, nsta = 1, nstm = 0;
		while (row < n) {
			if (row == 0 || row == n - 1) {
				int cst = 0;
				while (cst < n) {
					System.out.print("*\t");
					cst++;
				}
				row++;
				System.out.println();
			} else {
				int cspb = 0;
				while (cspb < nspb) {
					System.out.print("\t");
					cspb++;
				}
				int cstb = 0;
				while (cstb < nstb) {
					System.out.print("*\t");
					cstb++;
				}
				if (row <= n / 2) {
					int cspa = 0;
					while (cspa < nspa) {
						System.out.print("\t");
						cspa++;
					}
				} else {
					int cstm = 0;
					while (cstm < nstm) {
						System.out.print("*\t");
						cstm++;
					}
				}
				if (row != n / 2) {
					int csta = 0;
					while (csta < nsta) {
						System.out.print("*\t");
						csta++;
					}
				}
				row++;
				System.out.println();
				if (row <= n / 2) {
					nspb++;
					nspa -= 2;
				} else {
					nspb--;
					nstm++;
				}
			}

		}
	}
}