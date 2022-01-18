package ex11;

class 라면 {
    int kcal = 300;
    String color = "노란색";
    String type = "국물";
}

class 매운라면 extends 라면 { // 라면에서 매운라면을 상속한다.
    // 라면을 추상화 하여 매운라면은 다형성을 가진다.
    // 밑에 있는 주석이 extends로 들고 온 것이다.
    // int kcal = 300;
    // String color = "노란색";
    // String type = "국물";
    // int kcal = 200; // 지역변수이기 때문에 kcal하면 200이 뜬다.
    String type2 = "고춧가루";
    // 라면 영역과 매운라면 영역이 heap에 나누어진다.
    // 매운라면 영역에는 type2만 뜨고 라면 영역에는 라면 클래스 데이터가 뜬다.
}

public class ExtandsEx01 {
    public static void main(String[] args) {
        라면 s1 = new 라면();
        매운라면 s2 = new 매운라면(); // 매운라면만 가리킴
        라면 s3 = new 매운라면(); // 매운라면에 있는 라면을 가리킴.
        // 이것을 다형성이라고 부른다.

        System.out.println(s2.type2);

        System.out.println(s2.kcal);
        // extends하면 상속한 라면을 스캐닝해서 변수 주소를 가져온다.
        // 지목한 클래스가 나올 때까지 스캔한다. 모든 영역을 스캔하지 않음.

        // System.out.println(s3.type2); 위에서 밑으로 스캔된다.
        // 라면에는 type2가 없기 때문에 찾지 못한다.

    }
}
