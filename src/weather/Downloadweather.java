package weather;

import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import weather.weatherDto.Response.Body.Items.Item;

public class Downloadweather {
    public static List<Item> getweatherList(String category, String obsrValue) {
        Map<String, String> weatherMap = new HashMap<>();
        try {
            URL url = new URL(
                    "http://apis.data.go.kr/1360000/VilageFcstInfoService_2.0/getUltraSrtNcst?serviceKey=eCazEq%2FCP4iBdrQDcQQrLr3rgUrV%2ByZOFRdwxGTrcfeZbe3FqDvkQ6iMAWgeXRDOa%2FABNLYI3Dhz7hzxyUuI4A%3D%3D&numOfRows=10&pageNo=1&dataType=Json&base_date=20220126&base_time=0600&nx=92&ny=69&category=T1H&obsrValue=10");

        } catch (Exception e) {
            // TODO: handle exception
        }
        return null;
    }

}
