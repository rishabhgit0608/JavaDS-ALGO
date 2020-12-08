package pepTest;

import java.lang.reflect.Array;
import java.util.*;

public class boardpath {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		System.out.println(getCount(0, 6, new int[5]));
//		Scanner scn = new Scanner(System.in);
//		int n = scn.nextInt();
//		int a[] = new int[n];
//		int m = scn.nextInt();
//		System.out.println(getcount(a, m, 0));
//
//		System.out.println(getpath2(a, m, 0));
//		getpath(a, m, 0, "");
		System.out.println(getPath(new int[5], 6, 0));
		getpath(new int[5], 6, 0, "");
//
//	}
//

//
//	public static void getpath(int a[], int m, int r, String str) {
//		if (r == a.length) {
//			System.out.println(str);
//			return;
//		}
//		if (r > a.length) {
//			return;
//		}
//
//		for (int i = 1; i <= m; i++) {
//			getpath(a, m, r + i, str + i);
//		}
//		return;
//	}
//
//	public static ArrayList<String> getpath2(int a[], int m, int r) {
//		if (r == a.length) {
//
//			ArrayList<String> pq = new ArrayList<String>();
//			pq.add("");
//			return pq;
//		}
//		if (r > a.length) {
//
//			ArrayList<String> p = new ArrayList<String>();
//			// p.add("");
//			return p;
//		}
//		ArrayList<String> str = new ArrayList<String>();
//		ArrayList<String> stri;
//		for (int i = 1; i <= m; i++) {
//			stri = getpath2(a, m, r + i);
//
//			for (String s : stri) {
//				str.add(i + "" + s);
//			}
//		}
//
//		return str;
//	}
//}

	}

	public static int getCount(int n, int m, int[] n1) {
		if (n1.length == n) {
			return 1;
		}
		if (n > n1.length) {
			return 0;
		}
		int count = 0;
		for (int i = 1; i < m; i++) {
			count += getCount(n + i, m, n1);
		}
		return count;

	}

	public static ArrayList<String> getPath(int[] a, int m, int r) {
		if (r == a.length) {
			ArrayList<String> br = new ArrayList<String>();
			br.add("");
			return br;
		}
		if (r > a.length) {
			ArrayList<String> br = new ArrayList<String>();
			return br;
		}
		ArrayList<String> arr;
		ArrayList<String> myres = new ArrayList<String>();
		for (int i = 1; i <= m; i++) {
			arr = getPath(a, m, r + i);
			for (int j = 0; j < arr.size(); j++) {
				myres.add(i+arr.get(j));
			}
		}
		return myres;

	}

	public static void getpath(int[] a, int m, int r, String str) {
		if (r == a.length) {
			System.out.println(str);
			return;
		}
		if (r > a.length) {
			return;
		}
		for (int i = 1; i <= m; i++) {
			getpath(a, m, r + i, str + i);
		}
	}
}