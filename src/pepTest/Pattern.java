package pepTest;

import java.util.*;

public class Pattern {

//	public static void main(String[] args) {

//		Scanner scn = new Scanner(System.in);
//		int n = scn.nextInt();
//		// int inc=1;
//		int mid = 0;
//		if (n % 2 == 0) {
//			mid = n / 2;
//		} else {
//			mid = (n + 1) / 2;
//
//		}
//		int inc = 1;
//		int dec = 0;
//		for (int i = 0; i < n; i++) {
//
//			if (i < mid) {
//				for (int j = 0; j < n; j++) {
//
//					System.out.print(inc + " ");
//					inc++;
//
//				}
//				if (i == mid - 1 && n % 2 == 0) {
//					dec = inc;
//				}
//				if (i == mid - 1 && n % 2 != 0) {
//					dec = inc - (2 * n);
//				}
//				inc = (inc - 1) + n + 1;
//
//			} else {
//
//				for (int j = 0; j < n; j++) {
//
//					System.out.print(dec + " ");
//					dec++;
//
//				}
//				dec = (dec - 1) - (3 * n) + 1;
//
//			}
//
//			System.out.println();
//
//		}
//	}
//}

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int n = sc.nextInt();
		int row = 0;
		int values = 1;
		int mid;
		if (n % 2 == 0) {
			mid = n / 2;
		} else {
			mid = (n + 1) / 2;
		}
		while (row < n) {
			int cst = 0;
			while (cst < n) {
				System.out.print(values + " ");
				values += 1;
				cst++;
			}

			if (row < mid) {
				values += n;
			}
			if (row == mid - 1 && n % 2 == 0) {
				values = values-n;
			}
			if (row == mid - 1 && n % 2 != 0) {
				values = (values) - (3 * n);
			}
			if (row >= mid) {
				values = ((values - 1) - (3 * n)) + 1;
			}
			row++;
			System.out.println();

		}
	}

}
