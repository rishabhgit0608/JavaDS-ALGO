package pepTest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

public class boardpath {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		Stack<Integer> st1 = new Stack<Integer>();
		Stack<Character> st2 = new Stack<Character>();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= '1' && ch <= '9') {
				st1.push(ch - '0');
			} else {
				if (st2.isEmpty() || prec(ch) > prec(st2.peek())) {
					st2.push(ch);
				} else if (ch == ')') {
					while (!st2.isEmpty() && st2.peek() != '(') {
						int a = st1.pop();
						int b = st1.pop();
						char op = st2.pop();
						st1.add(solve(a, b, op));
					}
					st2.pop();
				} else if (ch == '(') {
					st2.push(ch);
				} else if (!st2.isEmpty() && prec(ch) <= prec(st2.peek())) {
					while (!st2.isEmpty() && prec(ch) <= prec(st2.peek())) {
						int a = st1.pop();
						int b = st1.pop();
						char op = st2.pop();
						st1.add(solve(a, b, op));
					}
					st2.push(ch);
				}

			}
		}
		while (!st2.isEmpty()) {
			int a = st1.pop();
			int b = st1.pop();
			char op = st2.pop();
			st1.add(solve(a, b, op));
		}
		System.out.println(st1.pop());
	}

	public static int prec(char ch) {
		if (ch == '+' || ch == '-') {
			return 1;
		} else if (ch == '*' || ch == '/') {
			return 2;
		} else {
			return 0;
		}
	}

	public static int solve(int a, int b, char op) {
		if (op == '+') {
			return b + a;
		} else if (op == '-') {
			return b - a;
		} else if (op == '*') {
			return b * a;
		} else {
			return b / a;
		}
	}
}
