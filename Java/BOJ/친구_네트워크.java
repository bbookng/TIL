package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class 친구_네트워크 {

    static int[] parent;
    static int[] cnt;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());
        int F;

        for (int tc = 0; tc < T; tc++) {
            F = Integer.parseInt(br.readLine());
            HashMap<String, Integer> map = new HashMap<>();
            parent = new int[F * 2];
            cnt = new int[F * 2];
            Arrays.fill(cnt, 1);

            int idx = 0;
            for (int i = 0; i < F; i++) {
                st = new StringTokenizer(br.readLine(), " ");
                String friend1 = st.nextToken();
                String friend2 = st.nextToken();
                if (!map.containsKey(friend1)) {
                    parent[idx] = idx;
                    map.put(friend1, idx++);
                }
                if (!map.containsKey(friend2)) {
                    parent[idx] = idx;
                    map.put(friend2, idx++);
                }
                union(map.get(friend1), map.get(friend2));
                System.out.println(cnt[find(map.get(friend2))]);
            }
        }
    }

    public static void union(int a, int b) {
        // 최상위 부모 찾기
        int parentA=find(a);
        int parentB=find(b);
        // 같다면 이미 연결되어 있는 노드
        if(parentA==parentB) return;

        parent[parentB]=parentA; // a밑에 b가 들어감
        cnt[parentA]+=cnt[parentB]; // b가 추가됐으므로 cnt[a] 갱신
    }

    public static int find(int a) {
        if(parent[a]==a) return a; // 더 이상 부모가 없음
        return parent[a]=find(parent[a]); // 부모로 이동
    }
}
