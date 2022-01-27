package ex24;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

class MyScanner { // 스캐너 직접 만들 수도 있음
    InputStream in;
    InputStreamReader ir;
    BufferedReader br;

    MyScanner(InputStream in) {
        this.in = in;
        this.ir = new InputStreamReader(in);
        this.br = new BufferedReader(ir);
    }

    public String readLine() throws IOException {
        String line = br.readLine();
        return line;
    }
}

public class StreamEx04 {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // String line = sc.nextLine();
        // System.out.println(line);

        MyScanner sc = new MyScanner(System.in);
        try {
            String line = sc.readLine();
            System.out.println("받은 문자열:" + line);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
