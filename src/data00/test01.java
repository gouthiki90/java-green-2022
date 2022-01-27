package data00;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;

import data00.ResponseDto.Response.Body.Items.Item;

public class test01 {
    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL(
                "http://openapi.tago.go.kr/openapi/service/DmstcFlightNvgInfoService/getFlightOpratInfoList?serviceKey=wJmmW29e3AEUjwLioQR22CpmqS645ep4S8TSlqtSbEsxvnkZFoNe7YG1weEWQHYZ229eNLidnI2Yt5EZ3Stv7g%3D%3D&numOfRows=10&pageNo=1&depAirportId=NAARKPK&arrAirportId=NAARKPC&depPlandTime=20220125&airlineId=ABL&_type=json");
        try {
            HttpURLConnection conn = (HttpURLConnection) url.openConnection(); // 다운 캐스팅, 왜 부모로 리턴을 했을까?
            // https를 쓸지, http를 쓸지 정해져있지 않기 때문에 부모 타입으로 리턴하도록 했다. 때문에 명시적 형변환을 사용해야 한다.
            // conn - Byte Stream 선이 된다.

            // 원래 dfault 1Byte 한글을 읽었기 때문에 한글이 깨진다.
            // utf-8 한글을 3Byte로 끊어 읽겠다.
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(conn.getInputStream(), "utf-8")); // conn 입장에서 Input 해야 되는 입장
            // 원래 while을 돌려서 해야됨
            String responseJson = br.readLine();
            Gson gson = new Gson();
            ResponseDto dto = gson.fromJson(responseJson, ResponseDto.class);

            List<Item> result = dto.getResponse().getBody().getItems().getItem();
            System.out.println(result); // Item만 보고 싶을 때
            // System.out.println(dto);

            // System.out.println("받은 문자열" + responseJson); // 파싱해야됨

            Map<String, String> airportMap = new HashMap<>();
            for (int i = 0; i < result.size(); i++) {
                airportMap.put(result.get(i).getArrAirportNm(), result.get(i).getVihicleId());
            }
            System.out.println("제주");
        } catch (Exception e) {
            System.out.println("주소 입력이 잘못되었습니다.");
        }

    }
}
