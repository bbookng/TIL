package Programmers;

public class 연속된_부분_수열의_합 {
    static int end, nowSum, std;
    static int[] answer;

    public static int[] solution(int[] sequence, int k) {
        end = 0;
        nowSum = 0;
        std = sequence.length;

        for (int start = 0; start < sequence.length; start++) {
            while (nowSum < k && end < sequence.length) {
                nowSum += sequence[end];
                end ++;
            }

            if (nowSum == k && end - start - 1 < std) {
                std = end - start - 1;
                answer = new int[]{start, end-1};
            }
            nowSum = nowSum - sequence[start];
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(solution(array, 7));
    }
}
