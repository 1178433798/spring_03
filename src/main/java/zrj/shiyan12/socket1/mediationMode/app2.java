package zrj.shiyan12.socket1.mediationMode;

import java.io.IOException;
import java.net.Socket;

public class app2 {
    public static void main(String[] args) {
        Member normalMember = new NormalMember("123");
        try {
            normalMember.setSocket(new Socket("localhost", 8080));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        while (true){
            normalMember.sendText("normal用户", "123456");
        }
    }
}
