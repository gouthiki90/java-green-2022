package Ex00;

class Cal {

    static int add(int a1, int a2) { // 투입 라인, add queue에서 실행
        return a1 + a2; // 실행 후 main queue로 복귀함 = 70이란 값
    }

    static int multi(int a1, int a2) { // 70, 10
        return a1 * a2; // 700을 main stack에 return
    }
}

public class Practice {
    public static void main(String[] args) {
        int r1 = Cal.add(20, 50); // Queue에서 5번 실행 후 16번 실행함
        System.out.println(r1); // main stack에 있는 r1 출력
        int r2 = Cal.multi(r1, 10); // context swiching, 9번 실행 후 18번 실행함
        System.out.println(r2); // main stack의 r2를 출력
    }
}