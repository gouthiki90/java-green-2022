package ex24;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class StreamEx03 {
    public static void main(String[] args) {
        InputStream in = System.in; // 단점: 한자씩 숫자로 받는다
        InputStreamReader ir = new InputStreamReader(in); // 단점 : 고정된 길이를 받는다.

        BufferedReader br = new BufferedReader(ir); // 가변길이의 문자열을 받는다.(장점)
        try {
            String line = br.readLine();
            System.out.println("받은 문자열:" + line);
        } catch (IOException e) {
            e.printStackTrace();
        }

        BufferedReader reader = new BufferedReader(
                new InputStreamReader(in)); // 한줄로 적기 가능
                                            // Input이 있어야 버퍼 쓰기 가능
    }
}
