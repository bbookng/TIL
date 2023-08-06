package reflection;

import java.lang.reflect.Constructor;

class Test {
    public static void main(String args[]) throws Exception {
        /**
         * 1. Class 찾기
         * - Class 객체는 클래스 또는 인터페이스를 가리킨다. (java.lang.Class)
         * - Class 객체는 여러 메서드를 제공한다.
         * - 그 중 getName() 은 클래스의 이름을 리턴해준다.
         */
        Class clazz = Child.class;
        System.out.println("Class name: " + clazz.getName());

        /**
         * - 클래스의 이름을 몰랐을 때에는 Class.forName() 에 클래스 이름을 인자로 전달하여 클래스 정보를 가져올 수 있음
         * - 패키지 네임이 포함된 클래스 명을 써줘야 함.
         */
        Class clazz2 = Class.forName("reflection.Child");
        System.out.println("Class name: " + clazz2.getName());

        /**
         * 2. Constructor 찾기
         * - 생성자를 가져오는 방법
         */

        // 인자가 없는 생성자
        Constructor constructor = clazz2.getDeclaredConstructor();
        System.out.println("Constructor: " + constructor.getName());

        // 인자가 있는 생성자
        Constructor constructor2 = clazz2.getDeclaredConstructor(String.class);
        System.out.println("Constructor(String): " + constructor2.getName());

        // 모든 생성자
        Constructor constructors[] = clazz2.getDeclaredConstructors();
        for (Constructor cons : constructors) {
            System.out.println("Get constructors in Child: " + cons);
        }

        // public 생성자만 가져오는 방법
        Constructor constructors2[] = clazz2.getConstructors();
        for (Constructor cons : constructors2) {
            System.out.println("Get public constructors in Child: " + cons);
        }

        /**
         * 3. Method 찾기
         */
    }
}
