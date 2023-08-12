package B형특강;

import java.util.Scanner;

public class 이진수표현 {

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int tc = 1; tc <= T; tc++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            String result = "ON";

            for (int i = 0; i < n; i++) {
                if ((m & (1 << i)) == 0) {
                    result = "OFF";
                    break;
                }
            }
            System.out.println("#" + tc + " " + result);
        }
        sc.close();
    }

}
