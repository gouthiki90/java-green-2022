package data00;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class ResponseDto02 {
    @AllArgsConstructor
    @Data
    class response {
        @AllArgsConstructor
        @Data
        class header {
            private String resultCode;
            private String resultMsg;
        }

        @AllArgsConstructor
        @Data
        class body {
            @AllArgsConstructor
            @Data
            class Items {
                private List<Item> item;

                @AllArgsConstructor
                @Data
                class Item {
                    private String airportId;
                    private String airportNm;
                }
            }
        }
    }
}
