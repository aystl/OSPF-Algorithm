import java.io.IOException;
import java.net.ServerSocket;

import static java.lang.Thread.sleep;

public class C {
    public static void main(String[] args) throws Exception {
        ServerSocket ss3 = new ServerSocket(10088);
        Router r3 = new Router('C', ss3);
        sleep(20000);
        //r3.PrintChart();
        r3.SendHandShakeMessage();
        sleep(20000);
        //r3.PrintChart();
        r3.OrganizeLinkStateMessage();
        sleep(20000);
        //r3.PrintChart();
        r3.Dijkstra();
        r3.PrintDijkstra();
        sleep(20000);
        r3.Dijkstra();
        r3.PrintDijkstra();
    }
}
