package ex20;

public class LibEx01 {
    public static void main(String[] args) {
        double num = 10.5;
        double result = Math.abs(-10.0); // 리턴 타입을 확인해야 한다. control + 클릭
        double result2 = Math.ceil(num);
        double result3 = Math.floor(num);
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);

        System.out.println("================");
        double a = 1234.56789;
        System.out.println(Math.round(a)); // 반올림, long으로 리턴한다.

    }
}
