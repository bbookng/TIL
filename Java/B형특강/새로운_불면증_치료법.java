package B형특강;

import java.util.Scanner;

public class 새로운_불면증_치료법 {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int tc = 1; tc <= T; tc++) {
            int cnt = 0;
            int ans = 0;
            boolean[] visited = new boolean[10];
            int n = sc.nextInt();
            int num = 0;

            while (cnt < 10) {
                ans ++;
                num += n;
                String string_num = Integer.toString(num);
                for (int i = 0; i < string_num.length(); i++) {
                    int number = Character.getNumericValue(string_num.charAt(i));
                    if (!visited[number]) {
                        visited[number] = true;
                        cnt ++;
                    }
                }
            }
            System.out.println("#" + tc + " " + num);
        }
        sc.close();
    }
}
