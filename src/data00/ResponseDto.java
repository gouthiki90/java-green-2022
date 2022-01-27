package data00;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor // 생성자 생성
@Data // 게터, 세터, 투스트링까지 들고 있음
public class ResponseDto {
    private Response response; // 변수 명 꼭 동일하게 해야 파싱할 때 오류가 안 난다.

    @AllArgsConstructor
    @Data // 게터, 세터, 투스트링까지 들고 있음
    class Response {
        private Header header;
        private Body body;

        @AllArgsConstructor
        @Data // 게터, 세터, 투스트링까지 들고 있음
        class Header {
            private String resultCode;
            private String resultMsg;
        }

        @AllArgsConstructor
        @Data // 게터, 세터, 투스트링까지 들고 있음
        class Body {
            private Items items;
            private int numOfRows;
            private int pageNo;
            private int totalCount;

            @AllArgsConstructor
            @Data // 게터, 세터, 투스트링까지 들고 있음
            class Items {
                private List<Item> item;

                @AllArgsConstructor
                @Data // 게터, 세터, 투스트링까지 들고 있음
                class Item {

                    private String airlineNm;
                    private String arrAirportNm;
                    private String arrPlandTime;
                    private String depAirportNm;
                    private String depPlandTime;
                    private int economyCharge;
                    private int prestigeCharge;
                    private String vihicleId;
                }
            }
        }
    }

}
