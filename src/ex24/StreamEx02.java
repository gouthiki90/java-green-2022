package ex24;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class StreamEx02 {
    public static void main(String[] args) {
        // 한 자리의 숫자를 받을 수 있다.
        InputStream in = System.in;
        // 고정된 길이의 문자를 받을 수 있다.
        InputStreamReader ir = new InputStreamReader(in);
        // 캐스팅 하지 않고 문자로 바꿔줌

        char[] data = new char[3]; // char 2byte
        // 고정된 길이의 문자 넣기(단점)
        try {
            ir.read(data);
            System.out.println(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
