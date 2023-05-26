package zrj.shiyan12.mediationMode;

public class app {
    public static void main(String[] args) {
        ChatGroup chatGroup = new ChatGroup() ;
        Member normalMember = new NormalMember("normal用户") ;
        Member vipMember = new VIPMember("vip用户") ;
        chatGroup.register(normalMember);
        chatGroup.register(vipMember);
        normalMember.sendText(vipMember.getName(), "你好");
        normalMember.sendImage(vipMember.getName(), "PICTURE.jpg");
        vipMember.sendText(normalMember.getName(), "你好");
        vipMember.sendImage(normalMember.getName(), "IMAGE.jpg");
    }
}
