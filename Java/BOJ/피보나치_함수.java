package BOJ;

import java.io.*;

public class 피보나치_함수 {

    static Integer[][] arr = new Integer[41][2];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        arr[0][0] = 1;
        arr[0][1] = 0;
        arr[1][0] = 0;
        arr[1][1] = 1;

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            Fibonacci(N);
            bw.write(arr[N][0] + " " + arr[N][1] + "\n");
        }
        bw.flush();
        bw.close();
    }

    static Integer[] Fibonacci(int n) {
        // 해당 배열에 값이 없을 경우만 재귀가 실행되게 만들어서 메모리 낭비 줄이ㅣ
        if (arr[n][0] == null || arr[n][1] == null) {
            arr[n][0] = Fibonacci(n - 1)[0] + Fibonacci(n - 2)[0];
            arr[n][1] = Fibonacci(n - 1)[1] + Fibonacci(n - 2)[1];
        }
        return arr[n];
    }
}
