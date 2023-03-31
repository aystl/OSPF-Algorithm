import java.io.IOException;
import java.net.ServerSocket;

import static java.lang.Thread.sleep;

public class E {
    public static void main(String[] args) throws Exception {
        ServerSocket ss5 = new ServerSocket(10090);
        Router r5 = new Router('E', ss5);
        sleep(20000);
        //r5.PrintChart();
        r5.SendHandShakeMessage();
        sleep(20000);
        //r5.PrintChart();
        r5.OrganizeLinkStateMessage();
        sleep(20000);
        //r5.PrintChart();
        r5.Dijkstra();
        r5.PrintDijkstra();
        sleep(10000);
        r5.Break('F');
        r5.OrganizeLinkStateMessage();

        r5.Dijkstra();
        r5.PrintDijkstra();
    }
}
