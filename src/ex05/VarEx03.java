package ex05;

public class VarEx03 {
    public static void main(String[] args) {
        // stack start
        int n1; // 메모리 공간 int로 확보
        n1 = 10; // 4Byte
        long n2 = 20; // 8Byte
        double n3 = 30.1; // 8Byte
        boolean n4 = true; // or flase 20Byte+1bit
        // stack end

        double t1 = n1; // double의 공간이 더 크기 때문에 대입 가능
        // 이를 묵시적 형변환이라고 함 - 암묵적으로 자료 형태를 변환했다.
        // int t2 = n3; double이 더 커서 못 들어감
        int t2 = (int) n3; // 명시적 형변환
        System.out.println(t1); // 10.0, double 형변환
        System.out.println(t2); // 30, int 형변환

        long t3 = n1;
    }
}
