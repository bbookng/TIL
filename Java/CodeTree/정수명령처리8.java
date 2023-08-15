package CodeTree;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class 정수명령처리8 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String order = st.nextToken();
            switch (order) {
                case "push_front":
                    list.addFirst(Integer.parseInt(st.nextToken()));
                    break;
                case "push_back":
                    list.addLast(Integer.parseInt(st.nextToken()));
                    break;
                case "pop_front":
                    System.out.println(list.pollFirst());
                    break;
                case "pop_back":
                    System.out.println(list.pollLast());
                    break;
                case "size":
                    System.out.println(list.size());
                    break;
                case "empty":
                    int answer = list.isEmpty() ? 1 : 0;
                    System.out.println(answer);
                    break;
                case "front":
                    System.out.println(list.peekFirst());
                    break;
                case "back":
                    System.out.println(list.peekLast());
                    break;
            }
        }
    }
}
