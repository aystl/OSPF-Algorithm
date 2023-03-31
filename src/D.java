import java.io.IOException;
import java.net.ServerSocket;

import static java.lang.Thread.sleep;

public class D {
    public static void main(String[] args) throws Exception {
        ServerSocket ss4 = new ServerSocket(10089);
        Router r4 = new Router('D', ss4);
        sleep(20000);
        //r4.PrintChart();
        r4.SendHandShakeMessage();
        sleep(20000);
        //r4.PrintChart();
        r4.OrganizeLinkStateMessage();
        sleep(20000);
        //r4.PrintChart();
        r4.Dijkstra();
        r4.PrintDijkstra();

        sleep(20000);
        r4.Dijkstra();
        r4.PrintDijkstra();
    }
}
