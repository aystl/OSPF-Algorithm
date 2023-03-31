import java.io.IOException;
import java.net.ServerSocket;

import static java.lang.Thread.sleep;

public class F {
    public static void main(String[] args) throws Exception {
        ServerSocket ss6 = new ServerSocket(10091);
        Router r6 = new Router('F', ss6);
        sleep(20000);
        //r6.PrintChart();
        r6.SendHandShakeMessage();
        sleep(20000);
        //r6.PrintChart();
        r6.OrganizeLinkStateMessage();
        sleep(20000);
        //r6.PrintChart();
        r6.Dijkstra();
        r6.PrintDijkstra();
        sleep(10000);
        r6.Break('E');
        r6.OrganizeLinkStateMessage();

        r6.Dijkstra();
        r6.PrintDijkstra();
    }
}
