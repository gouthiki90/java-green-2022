package ex24;

import java.io.IOException;
import java.io.InputStream;

public class StreamEx01 {
    public static void main(String[] args) {
        // 키보드(소스)와 자바(목적지)에 stream이 연결된다.
        InputStream s = System.in; // 통신의 Byte stream을 제공해주는 라이브러리.
        // 컴퓨터 입장에서 s는 들어오는 입장
        try {
            int n = s.read(); // 10진수로 읽음
            System.out.println((char) n); // 캐스팅
            // 10진수에서 아스키코드를 형변환해서 A로 나옴
            // 직접 캐스팅 해야 됨(단점)
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
