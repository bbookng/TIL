package DP;

public class 코딩테스트_공부 {
    public static int solution(int alp, int cop, int[][] problems) {

        int algo = 0;
        int coding = 0;

        for (int i = 0; i < problems.length; i++) {
            algo = Math.max(problems[i][0], algo);
            coding = Math.max(problems[i][1], coding);
        }

        if (algo <= alp && coding <= cop) return 0;

        if (alp > algo) alp = algo;
        if (cop > coding) cop = coding;

        int[][] dp = new int[algo + 2][coding + 2];

        for (int i = alp; i <= algo; i++) {
            for (int j = cop; j <= coding; j++) {
                dp[i][j] = Integer.MAX_VALUE;
            }
        }

        dp[alp][cop] = 0;

        for (int i = alp; i <= algo; i++) {
            for (int j = cop; j <= coding; j++) {
                dp[i + 1][j] = Math.min(dp[i + 1][j], dp[i][j] + 1);
                dp[i][j + 1] = Math.min(dp[i][j + 1], dp[i][j] + 1);

                for (int[] problem : problems) {
                    if (i >= problem[0] && j >= problem[1]) {
                        // 둘 다 목표치보다 클 때
                        if (i + problem[2] >= algo && j + problem[3] >= coding) {
                            dp[algo][coding] = Math.min(dp[algo][coding], dp[i][j] + problem[4]);
                        } else if (i + problem[2] >= algo) {
                            dp[algo][j + problem[3]] = Math.min(dp[algo][j + problem[3]], dp[i][j] + problem[4]);
                        } else if (j + problem[3] >= coding) {
                            dp[i + problem[2]][coding] = Math.min(dp[i + problem[2]][coding], dp[i][j] + problem[4]);
                        } else if (i + problem[2] <= algo && j + problem[3] <= coding) {
                            dp[i + problem[2]][j + problem[3]] = Math.min(dp[i + problem[2]][j + problem[3]], dp[i][j] + problem[4]);
                        }
                    }
                }
            }
        }
        return dp[algo][coding];
    }

    public static void main(String[] args) {
        int[][] problems = {{10,15,2,1,2},{20,20,3,3,4}};
        System.out.println(solution(10, 10, problems));
    }
}
