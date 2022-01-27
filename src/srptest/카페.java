package srptest;

public class 카페 {
    public static void main(String[] args) {

        메뉴판 menu = new 메뉴판();
        손님 customor = new 홍길동("홍길동");
        바리스타 barista = new 공유();

        customor.order(barista, menu); // 시작 메서드

    }
}
