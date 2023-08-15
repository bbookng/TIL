package CodeTree;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class 정수명령처리5 {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> array = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String order = st.nextToken();
            switch (order) {
                case "push_back":
                    array.add(Integer.parseInt(st.nextToken()));
                    break;
                case "pop_back":
                    array.remove(array.size() - 1);
                    break;
                case "size":
                    System.out.println(array.size());
                    break;
                case "get":
                    System.out.println(array.get(Integer.parseInt(st.nextToken())-1));
                    break;
            }
        }
    }
}
