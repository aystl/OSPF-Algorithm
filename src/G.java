import java.io.IOException;
import java.net.ServerSocket;

import static java.lang.Thread.sleep;

public class G {
    public static void main(String[] args) throws Exception {
        ServerSocket ss7 = new ServerSocket(10092);
        Router r7 = new Router('G', ss7);
        sleep(20000);
        //r7.PrintChart();
        r7.SendHandShakeMessage();
        sleep(20000);
        //r7.PrintChart();
        r7.OrganizeLinkStateMessage();
        sleep(20000);
        //r7.PrintChart();
        r7.Dijkstra();
        r7.PrintDijkstra();
        sleep(20000);
        r7.Dijkstra();
        r7.PrintDijkstra();
    }
}
