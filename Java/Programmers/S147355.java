package Programmers;

public class S147355 {
    public static int solution(String t, String p) {
        long number = Long.parseLong(p);
        int size = p.length();
        int answer = 0;

        for (int i = 0; i < t.length() - size + 1; i++) {
            if (number >= Long.parseLong(t.substring(i, i+size))) answer ++;
        }
        return answer;
    }

    public static void main(String[] agrs) {
        System.out.println(solution("10203", "15"));
    }
}
