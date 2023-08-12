package B형특강;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class 암호문3 {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        LinkedList<String> password;

        for (int tc = 1; tc < 11; tc++) {
            password = new LinkedList<>();
            br.readLine();
            st = new StringTokenizer(br.readLine(), " ");
            while (st.hasMoreTokens()) {
                password.add(st.nextToken());
            }

            br.readLine();
            st = new StringTokenizer(br.readLine(), " ");
            int x, y;
            while (st.hasMoreTokens()) {
                switch (st.nextToken()) {
                    case "I":
                        x = Integer.parseInt(st.nextToken());
                        y = Integer.parseInt(st.nextToken());
                        for (int i = 0; i < y; i++) {
                            password.add(x++, st.nextToken());
                        }
                        break;
                    case "D":
                        x = Integer.parseInt(st.nextToken());
                        y = Integer.parseInt(st.nextToken());
                        for (int i = 0; i < y; i++) {
                            password.remove(x);
                        }
                        break;
                    case "A":
                        y = Integer.parseInt(st.nextToken());
                        for (int i = 0; i < y; i++) {
                            password.add(st.nextToken());
                        }
                        break;
                }
            }
            System.out.print("#" + tc);
            for (int i = 0; i < 10; i++) {
                System.out.print(" " + password.get(i));
            }
            System.out.println();
        }
    }
}
