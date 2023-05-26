package zrj.shiyan12.socket1.mediationMode;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ChatGroup extends Thread{
    public static final int port = 8080;//监听的端口号
    protected Map<String, Socket> memberMap=new HashMap<>();
    private Socket client;
    public static void main(String[] args) {

            System.out.println("Server...\n");
            ChatGroup chatGroup=new ChatGroup();
            chatGroup.init();
    }

    public void init() {
        try {
            ServerSocket serverSocket = new ServerSocket(port);
            while (true) {
                //从请求队列中取出一个连接
                 client = serverSocket.accept();
                // 处理这次连接
                sendText();
            }
        } catch (Exception e) {
            System.out.println("服务器异常: " + e.getMessage());
        }
    }
    public void sendText() {
        try {
            // 读取客户端数据
            BufferedReader input = new BufferedReader(new InputStreamReader(client.getInputStream()));
            String clientInputStr = input.readLine();//这里要注意和客户端输出流的写方法对应,否则会抛 EOFException
            String[] split = clientInputStr.split("-");
            memberMap.put(split[0],client);
            // 处理客户端数据
            System.out.println("发过来的内容:" + split[2]);
            Socket socket = memberMap.get(split[1]);
            if (Objects.nonNull(socket)){
                PrintStream out = new PrintStream(socket.getOutputStream());
                out.println(clientInputStr);
            }
        }catch (Exception e){

        }
    }


}
