package reflection;

public class StaticExample {
    public static String EXAMPLE = "Example";

    public static int getSquare(int num) {
        System.out.println("Get square: " + num * num);
        return num * num;
    }
}
