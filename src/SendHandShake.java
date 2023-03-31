import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.ArrayList;

import static java.lang.Thread.sleep;

public class SendHandShake implements Runnable {
    //private char ID;
    ArrayList<Handshake> handArr;//要发送的报文

    SendHandShake(ArrayList<Handshake> handArr) {
        this.handArr = handArr;
    }

    @Override
    public void run() {
        try {
            for (Handshake h : handArr) {
                Socket s = new Socket("192.168.56.1", h.tar_port);
                //System.out.println(s.isConnected());
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
                bw.write(h.type);
                bw.write(h.srcID);
                bw.write(h.distance);
                bw.flush();
                s.shutdownOutput();
                s.close();
                sleep(500);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

