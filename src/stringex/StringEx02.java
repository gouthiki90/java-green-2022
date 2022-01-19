package stringex;

public class StringEx02 {
    public static void main(String[] args) {
        String s1 = new String("고구마");
        String s2 = new String("고구마");
        System.out.println("s1" + s1);
        System.out.println("s2" + s2);

        if (s1 == s2) {
            System.out.println("같은 문자열이에요");
        } else {
            System.out.println("다른 문자열이에요");
        }

        if (s1.equals(s2)) { // equals 메소드는 주소도 비교하고 값도 비교한다.
            System.out.println("같은 문자열이에요");
        } else {
            System.out.println("다른 문자열이에요");
        }
    }
}
