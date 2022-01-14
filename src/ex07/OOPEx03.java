package ex07;

class Cars {
    int speed = 90; // call by referance, 사이즈를 알 수 없으니까
    // static int n = 80; // 처음부터 static에 뜨기 때문에 heap에 들어갈 필요가 없음
}

public class OOPEx03 {
    public static void main(String[] args) {
        // new는 heap에 할당하라는 키워드이다.
        // Car 클래스가 가지고 있는 static이 아닌 모든 것들이 heap에 뜬다.
        Cars s1 = new Cars(); // 커스텀 타입 : Car 변수(데이터 주소) =
        System.out.println(s1.speed);

        Cars s2 = new Cars();
        System.out.println(s2.speed);
    }
}