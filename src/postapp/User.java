package postapp;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor // User(풀생성)
@Data // getter, setter, toString 자동생성
public class User {
    private int id;
    private String username; // 아이디
    private String password; // 비밀번호
    private String email;
    private String created;
    private String updated;
}
