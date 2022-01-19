package srp;

// 종업원과 요리사는 협력 관계
// 호출만 당하면 된다.
public class 요리사 {
    public 음식 음식생성() {
        음식 jjajang = new 음식("짜장면"); // 음식을 생성해야 된다는 책임 수행
        return jjajang; // 음식을 보냄
    }
}
