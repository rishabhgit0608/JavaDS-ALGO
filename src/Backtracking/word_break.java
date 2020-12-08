package Backtracking;

import java.util.HashSet;
import java.util.Scanner;

public class word_break {

static Scanner sc = new Scanner(System.in);

	public static void main(String args[]) {
		int n = sc.nextInt();
		HashSet<String> dic = new HashSet<>();
		for (int i = 0; i < n; i++) {
			dic.add(sc.next());
		}
		String str = sc.next();
		wordBreak(dic, str, "");
	}

	public static void wordBreak(HashSet<String> dic, String str, String maker) {
		if(str.length()==0) {
			System.out.println(maker);
			return;
		}
		for (int i = 0; i < str.length(); i++) {
			String left = str.substring(0,i+1);
			if(dic.contains(left)) {
				String right = str.substring(i+1);
				wordBreak(dic, right, maker+left+" ");
			}
		}

	}

	
}

