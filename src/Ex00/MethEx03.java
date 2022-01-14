package Ex00;

/**
 * 메서드 규칙
 * 1. 투입구와 출구가 있다. 단, 출구(return)는 항상 필요하지는 않다.
 * 2. 메서드는 하나의 모듈(특정한 역할(목적)을 수행하는)이 될 수 있다.
 * 3. 출구가 없을 때 void를 사용하고, 출구가 있을 때는 타입을 동일하게 해준다.
 * 4. return의 타입과 출구의 타입이 같아야 한다.
 * 5. 메서드 내부(queue)를 몰라도 사용할 수 있다.(캡슐화)
 * 6. 메서드는 1급 객체가 아니다. 자바에서는 1급 객체가 class 밖에 없다.
 * 7. 메서드를 만드는 이유 : 메서드의 내부를 몰라도 모듈을 사용하면 편리하게 사용할 수 있다.
 * 특정한 목적을 수행하는 코드 꾸러미(모듈)을 만들기 위해서.
 * 이는 재활용이 가능하고 캡슐화가 가능하다. 코드 관리도 쉽다. 메모리 관리도 쉽다. (stack에만 사용해서)
 * 8. static 메서드 내부에서는 heap에 있는 데이터를 찾을 수 없다.
 */

public class MethEx03 {

    int sum = 0; // static, stack에도 데이터상으로 존재하지 않음
    // heap에는 들어간 상황

    void start() { // heap에 데이터 저장, static이면 heap에 들어간 상태가 실행되지 않음
        int n1 = 10;
        int n2 = 20;
        int result = n1 + n2;
        sum = result;
        // static이라면 sum이라는 데이터가 존재하지 않기 때문에
        // heap 데이터는 static에 참조할 수 없다.
        // 동적 할당이기 때문에 static을 호출한 후에 heap을 할당하면 heap을 찾을 수 없다.
    }

    public static void main(String[] args) {
        MethEx03 m = new MethEx03(); // heap 데이터를 먼저 찾고
        m.start(); // stack queue 시작
        // 같은 클래스에 있기 때문에 클래스명 생략 가능하다.
        System.out.println(m.sum);
    }
}
