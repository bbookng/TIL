package BOJ;

import java.io.*;

public class FizzBuzz {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s1 = br.readLine();
        String s2 = br.readLine();
        String s3 = br.readLine();

        int result = 0;

        if (isNumber(s1)) {
            result = Integer.parseInt(s1) + 3;
        } else if (isNumber(s2)) {
            result = Integer.parseInt(s2) + 2;
        } else if (isNumber(s3)) {
            result = Integer.parseInt(s3) + 1;
        }

        if (result % 3 == 0 && result % 5 == 0) {
            bw.write("FizzBuzz");
        } else if (result % 3 == 0) {
            bw.write("Fizz");
        } else if (result % 5 == 0) {
            bw.write("Buzz");
        } else {
            bw.write(String.valueOf(result));
        }

        bw.flush();
        bw.close();
    }

    public static boolean isNumber(String s) {
        return s.matches("[+-]?\\d*(\\.\\d+)?");
    }
}
