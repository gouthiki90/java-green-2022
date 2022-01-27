package data01;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor // 모든 객체 생성자 추가
@Setter // setter 만들어줌
@Getter // getter 만들어줌
class 사자 {
    private String name;
    private String color;
}

public class Testlombok {
    public static void main(String[] args) {
        사자 s = new 사자("사자", "노랑");
        // s.setName("사자");
        System.out.println(s.getName());
    }
}
