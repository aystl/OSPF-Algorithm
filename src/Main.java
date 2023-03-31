import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) throws Exception {
        ServerSocket ss1 = new ServerSocket(10086);
        ServerSocket ss2 = new ServerSocket(10087);
        ServerSocket ss3 = new ServerSocket(10088);
        ServerSocket ss4 = new ServerSocket(10089);
        ServerSocket ss5 = new ServerSocket(10090);
        ServerSocket ss6 = new ServerSocket(10091);
        ServerSocket ss7 = new ServerSocket(10092);
        ServerSocket ss8 = new ServerSocket(10093);
        Router r1 = new Router('A', ss1);
        Router r2 = new Router('B', ss2);
        Router r3 = new Router('C', ss3);
        Router r4 = new Router('D', ss4);
        Router r5 = new Router('E', ss5);
        Router r6 = new Router('F', ss6);
        Router r7 = new Router('G', ss7);
        Router r8 = new Router('H', ss8);
        r1.SendHandShakeMessage();
        r2.SendHandShakeMessage();
        r3.SendHandShakeMessage();
        r4.SendHandShakeMessage();
        r5.SendHandShakeMessage();
        r6.SendHandShakeMessage();
        r7.SendHandShakeMessage();
        r8.SendHandShakeMessage();
        //sleep(5000);
        //打印握手后每个路由器记录的chart数组
        /*r1.PrintChart();
        r2.PrintChart();
        r3.PrintChart();
        r4.PrintChart();
        r5.PrintChart();
        r6.PrintChart();
        r7.PrintChart();
        r8.PrintChart();*/
        sleep(3000);
        r1.OrganizeLinkStateMessage();
        r2.OrganizeLinkStateMessage();
        r3.OrganizeLinkStateMessage();
        r4.OrganizeLinkStateMessage();
        r5.OrganizeLinkStateMessage();
        r6.OrganizeLinkStateMessage();
        r7.OrganizeLinkStateMessage();
        r8.OrganizeLinkStateMessage();
        sleep(5000);
        /*r1.PrintChart();
        r2.PrintChart();
        r3.PrintChart();
        r4.PrintChart();
        r5.PrintChart();
        r6.PrintChart();
        r7.PrintChart();
        r8.PrintChart();*/
        /*System.out.println(r1.receivedMessages);
        System.out.println(r2.receivedMessages);
        System.out.println(r3.receivedMessages);
        System.out.println(r4.receivedMessages);
        System.out.println(r5.receivedMessages);
        System.out.println(r6.receivedMessages);
        System.out.println(r7.receivedMessages);
        System.out.println(r8.receivedMessages);*/
        r1.Dijkstra();
        r1.PrintDijkstra();
        r2.Dijkstra();
        r2.PrintDijkstra();
        r3.Dijkstra();
        r3.PrintDijkstra();
        r4.Dijkstra();
        r4.PrintDijkstra();
        r5.Dijkstra();
        r5.PrintDijkstra();
        r6.Dijkstra();
        r6.PrintDijkstra();
        r7.Dijkstra();
        r7.PrintDijkstra();
        r8.Dijkstra();
        r8.PrintDijkstra();

        /**下面模拟E,F两路由器断开连接
         * 断开连接后E,F路由器将改变自身Chart数组
         * 并重新组织LinkState报文进行洪泛发送
         * 其他路由器收到报文后也更新chart数组并重新用Dijkstra算法进行计算
         */
        System.out.println("下面模拟E,F两路由器断开连接\n" +
                "          断开连接后E,F路由器将改变自身Chart数组\n" +
                "          并重新组织LinkState报文进行洪泛发送\n" +
                "          其他路由器收到报文后也更新chart数组并重新用Dijkstra算法进行计算\n" +
                "         ");

        r4.chart[4][5] = r4.chart[5][4] = r5.chart[4][5] = r5.chart[5][4] = 9999;
        r4.OrganizeLinkStateMessage();
        r5.OrganizeLinkStateMessage();
        sleep(1000);
        r1.PrintChart();
        r2.PrintChart();
        r3.PrintChart();
        r4.PrintChart();
        r5.PrintChart();
        r6.PrintChart();
        r7.PrintChart();
        r8.PrintChart();
        r1.Dijkstra();
        r1.PrintDijkstra();
        r2.Dijkstra();
        r2.PrintDijkstra();
        r3.Dijkstra();
        r3.PrintDijkstra();
        r4.Dijkstra();
        r4.PrintDijkstra();
        r5.Dijkstra();
        r5.PrintDijkstra();
        r6.Dijkstra();
        r6.PrintDijkstra();
        r7.Dijkstra();
        r7.PrintDijkstra();
        r8.Dijkstra();
        r8.PrintDijkstra();
    }


}