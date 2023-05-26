package zrj.shiyan12.socket1.mediationMode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class NormalMember extends Member {

    public NormalMember(String name) {
        super(name);
    }

    @Override
    public void sendText(String to, String text) {

        try {
            BufferedReader input = new BufferedReader(new InputStreamReader(super.getSocket().getInputStream()));
            //向服务器端发送数据
            PrintStream out = new PrintStream(super.getSocket().getOutputStream());
            out.println(super.getName()+"-"+to+"-"+text);
            //读取服务器端数据
            String ret = input.readLine();
            System.out.println(ret);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
     void sendImage(String to, String img) {
//        this.chatRoom.sendText(this.getName(),to,img);
    }


    @Override
    public void recvText(String from, String text) {
        System.out.println(String.format("[INFO] %s recv-from %s : %s", this.getName(),from,  text));
    }

    @Override
    void recvImage(String from, String img) {
        System.out.println(String.format("[INFO] %s recv-audio-from %s : %s",this.getName(), from, img));
    }


}
