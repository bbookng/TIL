package Programmers;

import java.util.*;

class Solution {
    private int[][] visited;

    private int dfs(int x, int y, int m, int n, boolean[][] isPuddles){
        if(x > m || y > n || isPuddles[x][y]) return 0; // 범위를 벗어나거나 물 웅덩이인 경우 0 반환
        if(x == m && y == n) return 1;
        if(visited[x][y] != -1) return visited[x][y];
        visited[x][y] = 0;

        int nx = x + 1;
        int ny = y + 1;

        visited[x][y] = (dfs(nx, y, m, n, isPuddles) + dfs(x, ny, m, n, isPuddles)) % 1000000007;
        return visited[x][y];
    }

    public int solution(int m, int n, int[][] puddles) {
        visited = new int[m + 1][n + 1];
        for (int[] ints : visited) {
            Arrays.fill(ints, -1);
        }
        boolean[][] isPuddle = new boolean[m+1][n+1];
        for (int[] puddle : puddles) {
            isPuddle[puddle[0]][puddle[1]] = true;
        }
        return dfs(1,1,m,n,isPuddle);
    }
}
