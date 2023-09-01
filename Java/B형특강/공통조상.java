package B형특강;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class 공통조상 {
    static int ans, N, M, A, B;
    static Node[] nodes;
    static ArrayList<Integer> ancestorA, ancestorB;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc < T + 1; tc++) {
            st = new StringTokenizer(br.readLine(), " ");
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            A = Integer.parseInt(st.nextToken());
            B = Integer.parseInt(st.nextToken());
            nodes = new Node[N + 1];
            ancestorA = new ArrayList<>();
            ancestorB = new ArrayList<>();

            for (int i = 1; i <= N; i++) {
                nodes[i] = new Node();
            }

            st = new StringTokenizer(br.readLine(), " ");
            for (int i = 0; i < M; i++) {
                int p, c;
                p = Integer.parseInt(st.nextToken());
                c = Integer.parseInt(st.nextToken());

                nodes[p].children.add(c);
                nodes[c].parents = p;
            }

            traverse(A, ancestorA);
            traverse(B, ancestorB);

            for (int i = 0; i < N; i++) {
                if (!ancestorA.get(i).equals(ancestorB.get(i))) break;
                ans = ancestorA.get(i);
            }

            System.out.printf("#%d %d %d\n", tc, ans, dfs(ans));
        }
    }
    
    public static int dfs(int idx) {
        int res = 1;
        for (int child : nodes[idx].children) {
            res += dfs(child);
        }
        return res;
    }

    // 조상 찾기 메서드
    public static void traverse(int idx, ArrayList<Integer> ancestor) {
        int parent = nodes[idx].parents;
        if (parent != 0) {
            traverse(parent, ancestor);
        }
        ancestor.add(idx);
    }


    static public class Node {
        List<Integer> children;
        int parents;

        Node() {
            this.children = new ArrayList<> ();
            this.parents = 0;
        }
    }
}
