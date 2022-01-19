package srp;

// 손님 - 종업원의 관계(의존적 관계)
// 손님이 종업원을 호출하는 관계, 따라서 손님이 종업원의 레퍼런스 주소를 알아야 됨
public class 손님 {
    public void 주문하기(종업원 manager, 요리사 chef) { // 시작 메서드
        음식 jjajang = manager.주문받기(chef); // 메서드 호출, stack안에서 stack이 열린다.
        // 관계를 맺는다. 손님이 주문하면 주문을 받는 관계를 설명한다.
        // 주문하기 메서드에 종업원의 레퍼런스 주소를 매개변수로 지정해야 주문하기를 할 때 주문 받기가 따라간다.
        System.out.println(jjajang.getName() + "을 먹습니다.");
    }
}
