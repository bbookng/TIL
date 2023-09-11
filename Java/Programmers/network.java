package Programmers;

public class network {
    static boolean[] visited;
    static int answer = 0;

    public static int solution(int n, int[][] computers) {
        visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                answer ++;
                dfs(i, computers);
            };
        }
        return answer;
    }

    public static void dfs(int n, int[][] computers) {
        visited[n] = true;
        for (int i = 0; i < computers.length; i++) {
            if (!visited[i] && computers[n][i] == 1) {
                visited[i] = true;
                dfs(i, computers);
            }
        }
    }

    public static void main(String[] args) {
        int n = 3;
        int[][] computers = {{1, 1, 0}, {1, 1, 1}, {0, 1, 1}};

        System.out.println(solution(n, computers));
    }
}
