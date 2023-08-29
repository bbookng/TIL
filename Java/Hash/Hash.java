package Hash;

import java.util.HashSet;
import java.util.Objects;

public class Hash {
    private static class Coord {
        public final int x;
        public final int y;

        private Coord(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int hashCode() {
            return (x + "," + y).hashCode();
        }

        @Override
        public boolean equals(Object obj) {
            if (!(obj instanceof  Coord)) return false;
            Coord o = (Coord) obj;
            return x == o.x && y == o.y;
        }
    }

    public static void main(String[] args) {
        HashSet<Coord> coordSet = new HashSet<>();

        Coord coord1 = new Coord(1, 2);
        coordSet.add(coord1);
        Coord coord2 = new Coord(1, 2);

        // 해시 값을 정의하지 않았기 때문에 문제 발생
        // 값이 같지만 서로 다른 객체로 인식하고 있음
        System.out.println(coordSet.contains(coord2));

        // hashcode()
        System.out.println(coord1.hashCode());
        System.out.println(coord2.hashCode());
    }
}
