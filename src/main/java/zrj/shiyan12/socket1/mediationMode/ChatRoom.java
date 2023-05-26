package zrj.shiyan12.socket1.mediationMode;

import zrj.shiyan12.socketTest.Server;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

public abstract class ChatRoom {
    protected Map<String, Member> memberMap=new HashMap<>();


    public  void register(Member member){
        memberMap.put(member.getName(),member);
//        member.setChatRoom(this);
    }
    public abstract void sendText(String from,String to,String message);
    public abstract void sendImage(String from,String to,String image);
}
