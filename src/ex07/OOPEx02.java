package ex07;

class Doctor { // 커스텀 타입, 설계도 생성
    String name = "홍길동"; // 오브젝트 생성
    int sal = 5000;
}

public class OOPEx02 {
    public static void main(String[] args) {
        Doctor n = new Doctor(); // n = 레퍼런스 변수, main stack에 저장
        // stack에 저장된 주소에서 점프해서 heap에 있는 최종목적지 데이터를 가져옴
        // heap에 할당, 주소를 가지고 있기 때문에 4Byte 크기를 가지고 있다.

        System.out.println(n.name); // 인스턴스 출력
        System.out.println(n.sal);
    }
}
