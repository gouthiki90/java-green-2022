package ex05;

public class VarEx02 {
    public static void main(String[] args) {
        int n1; // 메모리 공간 int로 확보
        n1 = 10; // 4Byte
        long n2 = 20; // 8Byte
        double n3 = 30.1; // 8Byte
        boolean n4 = true; // or flase 20Byte+1bit
        // 타입이 있는 언어들이다.
        // 자료형 변수 = 값;
        System.out.println(n1); // answer is 10
        System.out.println(n2); // answer is 20
        System.out.println(n3); // answer is 30.1
        System.out.println(n4); // answer is true
    }
}
