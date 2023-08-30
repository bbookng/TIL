package B형특강;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 중위순회 {
    static int N;
    static String[] tree;

    public static void inOrder(int idx) {
        if (idx*2 <= N) inOrder(idx*2);
        System.out.print(tree[idx]);
        if (idx*2+1 <= N) inOrder(idx*2+1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        for (int i = 1; i < 11; i++) {
            N = Integer.parseInt(br.readLine());
            tree = new String[N + 1];

            for (int j = 0; j < N; j++) {
                // 해당 정점의 문자, 해당 정점의 왼쪽 자식, 오른쪽 자식의 정점 번호 순서
                st = new StringTokenizer(br.readLine(), " ");
                tree[Integer.parseInt(st.nextToken())] = st.nextToken();
            }
            System.out.printf("#%d ", i);
            inOrder(1);
            System.out.println();
        }
    }
}
