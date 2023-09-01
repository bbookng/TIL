package DP;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class N으로표현 {
    public static int solution(int N, int number) {
        int answer = -1;

        ArrayList<Set<Integer>> dp = new ArrayList<>();

        for (int i = 1; i < 9; i++) {
            Set<Integer> numbers = new HashSet<>();
            numbers.add(revertNumber(N, i));

            for (int j = 0; j < i-1; j++) {
                for (int x : dp.get(j)) {
                    for (int y : dp.get(i-j-2)) {
                        numbers.add(x + y);
                        numbers.add(x * y);
                        numbers.add(x - y);
                        if (y != 0) numbers.add(x / y);
                    }
                }
            }
            if (numbers.contains(number)) return i;

            dp.add(numbers);
        }
        return answer;
    }

    public static int revertNumber(int N, int i) {
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < i; j++) {
            sb.append(N);
        }
        return Integer.parseInt(sb.toString());
    }

    public static void main(String[] args) {
        System.out.println(N으로표현.solution(5, 12));
    }
}
