package Java;

public class StringExample {
    public static void main(String[] args) {
        String str1 = "Hello";          // String 리터럴
        String str2 = "Hello";          // String Pool에서 동일한 객체를 참조

        String str3 = new String("Hello");  // 새로운 String 객체 생성
        String str4 = new String("Hello");  // 또 다른 새로운 String 객체 생성

        // str1과 str2는 동일한 객체를 참조
        System.out.println(str1 == str2);   // true

        // str3과 str4는 서로 다른 객체를 참조
        System.out.println(str3 == str4);   // false

        // 문자열 값은 동일함
        System.out.println(str3.equals(str4)); // true
    }
}