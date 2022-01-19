package srp;

//종업원은 요리사와 관계(의존적 관계)
// 종업원이 요리사를 호출하기 때문에 요리사의 레퍼런스 주소를 알아야 한다.
public class 종업원 {
    public 음식 주문받기(요리사 chef) {
        음식 jjajang = chef.음식생성(); // 음식을 요리사에게 돌려 받아서(c 레퍼런스 주소) 음식생성 메소드 호출
        // 이것이 메시지 전달(massage call)
        return jjajang;
    }
}
