package BOJ;

import java.io.*;
import java.util.StringTokenizer;

public class 웰컴_키트 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] sizeArr = new int[6];

        StringTokenizer st = new StringTokenizer(br.readLine());
         for (int i = 0; i < 6; i++) {
            sizeArr[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        int result = 0;
        for (int i = 0; i < 6; i++) {
            result += sizeArr[i] / T;
            result = sizeArr[i] % T > 0 ? result + 1 : result;
        }

        bw.write(result + "\n");
        bw.write(N / P + " " + N % P);

        bw.flush();
        bw.close();
    }
}
