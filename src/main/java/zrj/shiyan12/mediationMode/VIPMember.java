package zrj.shiyan12.mediationMode;

public class VIPMember extends Member{
    public VIPMember(String name) {
        super(name);
    }

    @Override
    public void sendText(String to, String text) {
        this.chatRoom.sendText(this.getName(), to, text);
    }

    @Override
    void sendImage(String to, String img) {
        this.chatRoom.sendImage(this.getName(),to,img);
    }


    @Override
    public void recvText(String from, String text) {
        System.out.println(String.format("[INFO] VIP  %s recv-from %s : %s", this.getName(),from,  text));
    }

    @Override
    void recvImage(String from, String img) {
        System.out.println(String.format("[INFO] VIP  %s recv-audio-from %s : %s",this.getName(), from, img));
    }
}
