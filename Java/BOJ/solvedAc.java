package BOJ;

import java.io.*;
import java.util.Arrays;

public class solvedAc {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        int avg = (int) Math.round(n * 0.15);
        int sum = 0;

        for (int i = avg; i < n - avg; i++) {
            sum += arr[i];
        }

        double result = sum / (double) (n - avg * 2);
        bw.write(String.valueOf((int)Math.round(result)));
        bw.flush();
    }
}
