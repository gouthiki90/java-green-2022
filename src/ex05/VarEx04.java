package ex05;

public class VarEx04 {
    public static void main(String[] args) {
        // 1. 4가지 자료형 int, double, long, boolean들은 메모리의 공간을 미리 확보할 수 있다.
        // 2. 문자열은 사이즈를 알 수 없다. 이는 자료형이 아니다.
        String s1 = "안녕하세요"; // type 변수 = "문자열";
        System.out.println(s1); // answer is 안녕하세요
        String s2 = s1; // call by referance, type 변수(heap에서 포인터 가져옴, 안녕하세요를 heap에 저장) = "안녕하세요"
        // 실행 시에 4Byte (주소)저장
        System.out.println(s1); // answer is 안녕하세요
        s2 = "바보"; // 변수 = "문자열"(다른 공간의 포인터를 heap에서 가져옴, 바보 heap에 새로 저장)

        System.out.println(s1); // answer is 안녕하세요
        System.out.println(s2); // answer is 바보
    }
}
