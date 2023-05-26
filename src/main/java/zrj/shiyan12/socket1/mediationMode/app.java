package zrj.shiyan12.socket1.mediationMode;

import zrj.shiyan7.app2;

import java.io.IOException;
import java.net.Socket;

public class app {

    public static void main(String[] args) throws IOException {
        Member normalMember = new NormalMember("normal用户");
        try {
            normalMember.setSocket(new Socket("localhost", 8080));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        while (true){
            normalMember.sendText("123", "123");
        }


    }

}

