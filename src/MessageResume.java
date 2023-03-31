import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class MessageResume implements Runnable {

    public Socket s;
    public Router r;
    int temp;//接收到的字节暂存于此

    public MessageResume(Socket s, Router r) {
        this.s = s;
        this.r = r;
    }

    @Override
    public void run() {
        try {
            //System.out.println(Thread.currentThread().getName());
            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            //System.out.println(s.isConnected());
            ArrayList<Integer> message = new ArrayList<>();//用Integer数组表示报文
            while ((temp = br.read()) != -1) {
                //System.out.println(temp);
                message.add(temp);
            }
            //System.out.println(message);
            //s.close();
            Router.AnalysisMessage(message, r);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}