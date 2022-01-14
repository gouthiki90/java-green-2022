package ex06;

public class ConEx04 {
    public static void main(String[] args) {
        // else if(조건) = 그게 아니라 이것이라면
        int point = 81;

        if (point >= 90) { // flase
            System.out.println("A학점"); // when is ture
        } else if (point >= 80) { // point가 89~80 사이라면?
            System.out.println("B학점");
        } else if (point >= 70) {
            System.out.println("C학점");
        } else if (point >= 60) {
            System.out.println("D학점");
        } else { // 60점 이하의 모든 점수를 포함하기 때문에 else를 쓴다.
            System.out.println("F학점");
        }
    } // 메인 끝
}
