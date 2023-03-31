import java.io.IOException;
import java.net.ServerSocket;

import static java.lang.Thread.sleep;

public class H {
    public static void main(String[] args) throws Exception {
        ServerSocket ss8 = new ServerSocket(10093);
        Router r8 = new Router('H', ss8);
        sleep(20000);
        //r8.PrintChart();
        r8.SendHandShakeMessage();
        sleep(20000);
        //r8.PrintChart();
        r8.OrganizeLinkStateMessage();
        sleep(20000);
        //r8.PrintChart();
        r8.Dijkstra();
        r8.PrintDijkstra();
        sleep(20000);
        r8.Dijkstra();
        r8.PrintDijkstra();
    }
}
