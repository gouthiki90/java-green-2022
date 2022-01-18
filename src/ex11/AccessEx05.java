package ex11;

// 하나의 자바 파일은 두 개의 public class가 있을 수 없다. import 때문이다.
// 나중에는 영어로 클래스를 적어야 한다.
class 엘리스 {
    private int 목마름; // 객체는 선언만 하는 게 중요하다. 유지보수할 때 더 쉽기 때문.
    // 상태는 반드시 private로 만들어야 한다.
    // 상태는 행위를 통해 변경한다는 조건이 충족된다.
    // 변수 확인을 위한 메서드가 필요하다.

    엘리스(int 목마름) { // 변경 메소드(생성자)
        this.목마름 = 목마름;
    }

    public void 물마시기() { // 변경 메소드
        목마름 = 목마름 - 20;
    }

    public int 갈증확인하기() { // 확인 메서드, 목마름이라는 값을 확인하기 위해서 return이란 값이 필요하다.
        return 목마름;
    }
}

public class AccessEx05 {
    public static void main(String[] args) {
        엘리스 e1 = new 엘리스(100); // 처음에 오류가 나는 이유는 디폴트 생성자가 없기 때문. 이미 생성자를 초기화 해서.

        // 자바는 기본 자료형과 문자를 더하면 결합이 되고 문자열 타입으로 변환된다.
        System.out.println("엘리스의 갈증지수:" + e1.갈증확인하기());
        e1.물마시기();
        System.out.println("엘리스의 갈증지수:" + e1.갈증확인하기());
        e1.물마시기();
        e1.물마시기();
        System.out.println("엘리스의 갈증지수:" + e1.갈증확인하기());
    }
}
