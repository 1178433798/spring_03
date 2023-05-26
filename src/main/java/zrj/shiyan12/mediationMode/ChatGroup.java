package zrj.shiyan12.mediationMode;

public class ChatGroup extends ChatRoom{

    @Override
    public void sendText(String from, String to, String message) {
        memberMap.get(to).recvText(from, message);
    }

    @Override
    public void sendImage(String from, String to, String image) {
        memberMap.get(to).recvImage(from, image);
    }
}
