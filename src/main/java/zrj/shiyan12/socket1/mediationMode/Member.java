package zrj.shiyan12.socket1.mediationMode;

import lombok.Data;

import java.net.Socket;

@Data
public abstract class Member {

    protected ChatGroup chatRoom;
    private String name;

    private Socket socket;

    public Member(String name) {
        this.name = name;
    }

    public abstract void sendText(String to, String text) ;
     abstract void sendImage(String to, String img) ;
    public abstract void recvText(String from, String text) ;
     abstract void recvImage(String from, String img) ;



}
