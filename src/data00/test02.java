package data00;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import com.google.gson.Gson;

public class test02 {
    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL(
                "http://openapi.tago.go.kr/openapi/service/DmstcFlightNvgInfoService/getArprtList?serviceKey=wJmmW29e3AEUjwLioQR22CpmqS645ep4S8TSlqtSbEsxvnkZFoNe7YG1weEWQHYZ229eNLidnI2Yt5EZ3Stv7g%3D%3D&_type=json");
        try {
            HttpURLConnection conn = (HttpURLConnection) url.openConnection(); // stream 연결

            BufferedReader br = new BufferedReader( // Input하기
                    new InputStreamReader(conn.getInputStream()));
            String responseJson = br.readLine();

            Gson gson = new Gson(); // 파싱하기
            ResponseDto02 dto2 = gson.fromJson(responseJson, ResponseDto02.class);
            System.out.println(dto2);
            System.out.println("받은 문자열 : " + responseJson);

        } catch (Exception e) {
            System.out.println("받은 주소 입력이 잘못되었습니다.");
        }
    }
}
