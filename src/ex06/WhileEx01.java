package ex06;

import java.util.Scanner; //JDE, 사용자 키보드 입력 관련된 라이브러리

public class WhileEx01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int num = sc.nextInt();
            System.out.println("사용자 입력 :" + num);

            if (num == 0) {
                break;
            }
        }
    }
}
