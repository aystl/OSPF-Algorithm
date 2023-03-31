import java.io.IOException;
import java.net.ServerSocket;

import static java.lang.Thread.sleep;

public class B {
    public static void main(String[] args) throws Exception {
        ServerSocket ss2 = new ServerSocket(10087);
        Router r2 = new Router('B', ss2);
        sleep(20000);
        //r2.PrintChart();
        r2.SendHandShakeMessage();
        sleep(20000);
        //r2.PrintChart();
        r2.OrganizeLinkStateMessage();
        sleep(20000);
        //r2.PrintChart();
        r2.Dijkstra();
        r2.PrintDijkstra();
        sleep(20000);
        r2.Dijkstra();
        r2.PrintDijkstra();
    }
}
