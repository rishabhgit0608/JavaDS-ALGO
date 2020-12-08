package Backtracking;

import java.util.*;

public class printall_possible_palindromic_partitions {
	static Scanner sc = new Scanner(System.in);

	public static void main(String args[]) {
		String str = sc.next();
		palindrome(str, "");
	}

	private static void palindrome(String str, String ans) {
		if (str.length() == 0) {
			System.out.println(ans);
			return;
		}
		for (int i = 0; i < str.length(); i++) {
			String left = str.substring(0, i + 1);
			if (isValid(left)) {
				palindrome(str.substring(i + 1), ans + left + " ");
			}
		}

	}

	private static boolean isValid(String left) {
		// TODO Auto-generated method stub
		String res = "";
		for (int i = left.length() - 1; i >= 0; i--) {
			res += left.charAt(i);
		}
		if (res.equals(left)) {
			return true;
		}
		return false;
	}
}
