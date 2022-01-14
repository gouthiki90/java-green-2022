package ex06;

public class ConEx01 {
    public static void main(String[] args) {
        int point = 90; // 성적
        // 변수 초기화

        // 자바에서 ()괄호가 나오고 {}중괄호가 나오는 형태는 행위의 영역이다.
        if (point >= 90) { // if = kyeword, (true) or (flase)
            System.out.println("A학점 입니다."); // is true
        } else { // if가 아니면,
            System.out.println("A학점이 아닙니다."); // "문자열"을 출력한다.
        }
    }
}
