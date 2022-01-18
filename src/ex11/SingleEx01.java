package ex11;

// 패턴 -> 디자인 패턴(목적을 가진 설계) -> 누구나 동일하게 만들 수 있기 위해

//싱글톤 패턴, 객체를 하나만 만드는 패턴
// heap에 new를 하나만 만들어서 객체들을 공유하고 동적 할당을 한다.

class 튜브 {
    private static 튜브 instance = new 튜브(); // 싱글톤 패턴
    // 일정한 갯수를 만들면 풀링 기법 ex) 100개 new 만들기
    // heap에 있는 튜브를 static이란 성질을 부여해서 하나만 유지할 수 있도록 한다.
    // private을 통해서 강제성 부여한다.

    private 튜브() {
    } // 디폴트 생성자

    public static 튜브 getInstance() { // 유지하고 있는 튜브를 확인하는 메서드
        // private으로 튜브를 띄웠기 때문에 확인하는 메서드를 생성해야됨. 그래야 접근 가능.
        return instance;
    }

}

public class SingleEx01 {
    public static void main(String[] args) {
        튜브 t1 = 튜브.getInstance();
        튜브 t2 = 튜브.getInstance(); // 동일한 heap 공간을 사용함

        System.out.println(t1.hashCode()); // 주소번지를 해시코드로 바꾸어서 출력
        System.out.println(t2.hashCode());
        // object class가 모든 class에 extends로 생략되어있기 때문에 hashCode를 불러오기가 가능하다.
    }
}
