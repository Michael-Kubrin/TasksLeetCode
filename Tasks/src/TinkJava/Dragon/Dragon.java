package TinkJava.Dragon;

import java.util.Scanner;

class Dragon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int g = scanner.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = scanner.nextInt();
        }

        int[][] dp = new int[n + 1][g + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= g; j++) {
                dp[i][j] = dp[i - 1][j];
                if (j >= b[i - 1]) {
                    dp[i][j] = Math.max(dp[i][j], dp[i - 1][j - b[i - 1]] + a[i - 1]);
                }
            }
        }

        System.out.println(dp[n][g]);
    }
}