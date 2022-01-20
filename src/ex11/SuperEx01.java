package ex11;

class 가구 {
    String name = "가구";

    가구() { // 디폴트 생성자
        System.out.println("실행");
    }
}

// 1. super는 부모의 heap공간, this는 자신의 heap공간
// 자식을 new하면 자식의 생성자에 super() 문장이 생략되어 있다. (상속의 관계)
class 침대 extends 가구 {
    String name = "침대";

    침대() {
        super();
        // super() 이 문장은 항상 생략되어 있다. 상속 시 부모를 가르키는 것을 뜻하는 문장인데, 항상 생략되어 있는 것이다.
        System.out.println(super.name); // 가구라는 부모를 가르킨다.
    }
}

// super 부모, this 자기 자신
public class SuperEx01 {
    public static void main(String[] args) {
        가구 gagu = new 가구();
        침대 chim = new 침대();
    }

}
