package pepCoding.ArraysQues;

import java.util.*;

public class Diagonal_traversal {
	static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        int[][] ar = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                ar[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int a = ar[i][j];
                int max = a,min=a;
                for (int k = 0; k < n; k++) {
                    if (ar[k][j] <= a) {
                        
                    } else {
                        max = ar[k][j];
                        break;
                    }
                }
                for (int k = 0; k < n; k++) {
                    if (ar[i][k] >= a) {
                        
                    } else {
                        min = ar[i][k];
                        break;
                    }
                }
                if (max == a && min==a) {
                    System.out.println(ar[i][j]);
                    return;
                }
            }
        }
    }

}