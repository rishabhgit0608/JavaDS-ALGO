package pepCoding;

import java.util.*;

public class longest_subsequence {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int[] dp = new int[n];
		dp[0] +=arr[0];
		for (int i = 1; i < n; i++) {
			int j = i;
			while (j-- != 0) {
				if (arr[j] <= arr[i]) {
					dp[i] = Math.max(dp[j], dp[i]);
				}
			}
			dp[i] += arr[i];
		}
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			if (max < dp[i]) {
				max = dp[i];
			}
		}
		System.out.println(max);
	}

}