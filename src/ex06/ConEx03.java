package ex06;

public class ConEx03 {
    public static void main(String[] args) {
        int point = 81;

        if (point >= 90) {
            System.out.println("A학점 입니다."); // true일 때 출력
        } else { // flase일 때
            if (point >= 80) { // 중첩 IF문
                System.out.println("B학점 입니다."); // true일 때 출력
            } else {
                System.out.println("F학점 입니다."); // flase일 때 출력
            }
        }
    }
}
