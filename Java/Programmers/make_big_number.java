package Programmers;

public class make_big_number {
    public String solution(String number, int k) {
        String answer = "";
        StringBuilder sb = new StringBuilder();

        char[] array = number.toCharArray();

        int start = 0;

        for (int i = 0; i < array.length - k; i++) {
            char max = '0';
            for (int j = start; j <= i + k; j++) {
                if (array[j] > max) {
                    max = array[j];
                    start = j + 1;
                }
            }
            sb.append(Character.toString(max));
        }

        answer = sb.toString();
        return answer;
    }
}
