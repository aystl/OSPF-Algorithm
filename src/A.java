import java.io.IOException;
import java.net.ServerSocket;

import static java.lang.Thread.sleep;

public class A {
    public static void main(String[] args) throws Exception {
        ServerSocket ss1 = new ServerSocket(10086);
        Router r1 = new Router('A', ss1);
        sleep(20000);
        r1.PrintChart();
        r1.SendHandShakeMessage();
        sleep(20000);
        r1.PrintChart();
        r1.OrganizeLinkStateMessage();
        sleep(20000);
        r1.PrintChart();
        r1.Dijkstra();
        r1.PrintDijkstra();
        sleep(20000);
        r1.Dijkstra();
        r1.PrintDijkstra();
    }
}
