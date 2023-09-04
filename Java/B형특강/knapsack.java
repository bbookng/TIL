package B형특강;

import java.io.IOException;
import java.util.Scanner;

public class knapsack {
    static int N, K;
    static int[][] items;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int tc = 1; tc < T + 1; tc++) {
            N = sc.nextInt();
            K = sc.nextInt();
            items = new int[N + 1][2];

            for (int i = 1; i <= N; i++) {
                items[i][0] = sc.nextInt();
                items[i][1] = sc.nextInt();
            }

            int[][] dp = new int[N + 1][K + 1];

            for (int i = 1; i <= N; i++) {
                for (int j = 0; j <= K; j++) {
                    if (items[i][0] > j) {
                        dp[i][j] = dp[i - 1][j];
                    } else {
                        dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - items[i][0]] + items[i][1]);
                    }
                }
            }
            System.out.println("#" + tc + " " + dp[N][K]);

        }
        sc.close();
    }
}
