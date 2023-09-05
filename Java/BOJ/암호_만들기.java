package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 암호_만들기 {
    static int L, C;
    static char[] password, input;
    static boolean[] isVowels;
    static boolean[] visited;
    static StringBuilder sb;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;


        st = new StringTokenizer(br.readLine(), " ");
        L = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        input = new char[C];
        password = new char[C];
        isVowels = new boolean[C];
        visited = new boolean[C];

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < input.length; i++) {
            input[i] = st.nextToken().charAt(0);
        }
        
        Arrays.sort(input);

        for (int i = 0; i < input.length; i++) {
            if (input[i] == 'a' || input[i] == 'e' || input[i] == 'i' || input[i] == 'o' || input[i] == 'u') {
                isVowels[i] = true;
            }
        }

        backTracking(0, 0, 0, 0);
    }

    static void backTracking(int depth, int start, int vCnt, int cCnt) {
        if (depth == L && vCnt >= 1 && cCnt >= 2) {
            sb = new StringBuilder();
            for (int i = 0; i < L; i++) {
                sb.append(password[i]);
            }
            System.out.println(sb);
            return;
        }

        for (int i = start; i < input.length; i++) {
            int vCount = vCnt;
            int cCount = cCnt;
            if (!visited[i]) {
                if (isVowels[i]) {
                    vCount++;
                } else {
                    cCount++;
                }
                visited[i] = true;
                password[depth] = input[i];
                backTracking(depth + 1, i, vCount, cCount);
                visited[i] = false;
            }
        }

    }
}
