package zrj.shiyan12.mediationMode;

import lombok.Data;

import java.net.Socket;

@Data
public abstract class Member {

    public static final int port = 8080;
    public static final String host = "localhost";
    protected ChatRoom chatRoom;
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
