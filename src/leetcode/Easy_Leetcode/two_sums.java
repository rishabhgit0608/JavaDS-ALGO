package leetcode.Easy_Leetcode;

import java.io.BufferedReader;

import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class two_sums {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		int t = sc.nextInt();
		while (t-- != 0) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			if (n == k) {
				for (int i = 0; i < n; i++) {
					System.out.println((i + 1) + " ");
				}
			} else {
				int[] arr = new int[n];
				int sum = 1, counter, difference = 0;

				if (n % 2 == 0) {
					for (int i = 0; i < n; i++) {
						arr[i] = i + 1;
						if (i % 2 == 0) {
							arr[i] *= -1;
						}
					}
				} else {
					for (int i = 0; i < n; i++) {
						arr[i] = i + 1;
						if (i % 2 != 0) {
							arr[i] *= -1;
						}
					}

				}
				counter = (int) Math.ceil((float) n / 2);
				for (int i = 1; i < n; i++) {
					sum += arr[i];
					if (sum > 0) {
						if (counter < k) {
							difference = k - counter;
							for (int j = n - 1; j >= 0; j--) {
								if (arr[j] < 0) {
									arr[j] *= -1;
									counter++;
									if (counter == k) {
										break;
									}
								}
							}
						} else if (counter > k) {
							difference = k - counter;
							for (int j = n - 1; j >= 0; j--) {
								if (arr[j] > 0) {
									arr[j] *= -1;
									counter--;
									if (counter == k) {
										break;
									}
								}
							}
						}
					}

				}
				for (int i = 0; i < n; i++) {
					System.out.println(arr[i]+" ");
				}
				System.out.println();

			}
		}
	}
}