package postapp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.google.gson.Gson;

public class MainApp {
    public static void main(String[] args) {
        try {
            String addr = "http://lalacoding.site/init/post";
            URL url = new URL(addr);

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(conn.getInputStream()));
            String responseJson = br.readLine();
            Gson gson = new Gson();
            ResponseDto dto = gson.fromJson(responseJson, ResponseDto.class);

            System.out.println(dto.getData().size());
            // 19바퀴 0~18
            for (int i = dto.getData().size() - 1; i > 0; i--) {
                System.out.println("목록 : " + dto.getData().get(i).getId());
                System.out.println("제목 : " + dto.getData().get(i).getTitle());
                System.out.println("내용 : " + dto.getData().get(i).getContent());
            }

        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
