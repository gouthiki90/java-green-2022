package srp;

public class 요리프로그램 {
    public static void main(String[] args) { // 메인에서 할당
        손님 customer = new 손님();
        종업원 manager = new 종업원();
        요리사 chef = new 요리사();
        // 손님과 종업원, 요리사를 만드는 책임은 개발자에게 있다.
        // new는 하나만 만들어야 하니 main에 new한다.

        /**
         * 메소드 안에서 new를 하면 메소드가 실행될 때마다 new를 하기 때문에 데이터 관리가 안 된다.
         * 각 객체의 책임을 생각하면 손님과 종업원은 서로를 new할 책임은 없다.
         * 따라서 싱글톤으로 new를 하나 만들고 private로 해서 강제성 부여하면
         * 손님과 종업원의 의존관계를 벗어나고 종업원 안에서 new가 만들어져 레퍼런스 주소를 쓰지 않아도
         * static메소드 호출만 해서 관계할 수 있다.
         */

        customer.주문하기(manager, chef); // 시작 메서드
        // 손님이 요리사와 관계하지 않기 때문에 chef가 들어간 것은 안 된다.

        /**
         * 손님의 주문하기 메서드를 메인에 호출한다.
         * 여기에서 종업원의 주문 받기 메서드와 관계하기 때문에
         * 주문하기 메서드의 매개변수는 종업원의 메서드를 가지고 있는 레퍼런스 주소가 들어간다.
         * 따라서 손님이 주문하면 종업원이 주문을 받는 행위가 구현된다.
         */
    }
}
