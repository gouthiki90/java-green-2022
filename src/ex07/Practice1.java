package ex07;

class Cari {
    int speed = 90;
    int speed2 = 10;
}

public class Practice1 {
    public static void main(String[] args) {
        // Practice1와 Cari의 영역이 static에서 구분되어 있기 때문에 speed를 heap 할당 없이는 불러올 수 없다.
        Cari s1 = new Cari(); // new 때문에 heap에 할당
        // class의 이름이라는 자료형으로, Cari s1이라는 변수 설정
        System.out.println(s1.speed);

        Cari s2 = new Cari();
        System.out.println(s2.speed2);

    }
}
