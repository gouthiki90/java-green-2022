package postapp;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Data
public class ResponseDto {
    private int code;
    private String msg;
    private List<Data> data;

    @AllArgsConstructor
    @Setter
    @Getter
    @ToString
    class Data {
        private int id;
        private String title;
        private String content;
        private List<User> data;
        private String created;
        private String updated;
    }
}
