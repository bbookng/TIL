package Programmers;

public class S12951 {
    public static String solution(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] words = s.split(" ");
        for (String word : words) {
            if (word.length() == 0) stringBuilder.append(" ");
            else {
                stringBuilder.append(word.substring(0, 1).toUpperCase());
                stringBuilder.append(word.substring(1, word.length()).toLowerCase());
                stringBuilder.append(" ");
            }
        }

        String answer = stringBuilder.toString();

        if (s.substring(s.length() - 1, s.length()).equals(" ")) return answer;
        return answer.substring(0, answer.length() - 1);
    }

    public static void main(String args[]) {
        System.out.println(solution("3people unFollowed me"));
    }
}
