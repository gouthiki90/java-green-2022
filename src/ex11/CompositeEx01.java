package ex11;

class 엔진 {
    int power = 5000;
}

// 엔진을 상속 없이 재사용 하는 방법
// 생성자로 주입 받기
// 따라서 소나타는 엔진에 의존적이다. has 관계는 즉 의존 관계이다.
// 구체적인 것에 의존하고 있는 강한 결합은 코드 수정을 할 때 뜯어고쳐야 한다.
// 추상적인 것에 의존하고 있는 느슨한 결합은 코드 수정이 필요 없다.

class 소나타 { // has 관계, heap을 할당하면 유지보수 어려움.
    // 다형성이 안 되기 때문에 추상화 할 수 없음. 따라서 heap 할당 여기서 하지 말 것.
    // 이러한 관계는 강한 결합이기 때문에 heap 할당을 해도 구체적인 것에 의존하고 있어서 추상적인 것에 의존할 수 없고 맴돌기만 한다.

    // 엔진 engine; // null
    엔진 engine;

    소나타(엔진 engine) { // 생성자
        this.engine = engine;
    }
}

public class CompositeEx01 {
    public static void main(String[] args) {
        엔진 e = new 엔진();
        소나타 s = new 소나타(e);
        System.out.println(s.engine.power);
        // 아직 heap 할당을 하지 않았을 때
        // 변수에는 주소만 선언했기 때문에 공간 안에는 아무것도 없다.
        // power는 데이터 상에 존재하지 않기 때문에 power 경로를 적어도 엔진의 null만 나온다.
    }
}
