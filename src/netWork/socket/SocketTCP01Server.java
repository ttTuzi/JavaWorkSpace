package netWork.socket;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 1/9/2023 9:57 PM
 */
public class SocketTCP01Server {
    public static void main(String[] args) throws IOException {
//        //1.在本机的9999端口监听,等待链接
//        //  细节: 要求在本机没有其他服务在监听9999
//        //  细节: ServerSocket可以通过accept()返回对个socket
//        ServerSocket serverSocket = new ServerSocket(9999);
//        System.out.println("服务端, 在9999端口监听,等待链接...");
//        //2.当没有客户端链接9999时,程序堵塞,等待链接
//        //  如果有客户端则会返回socket对象,程序进行
//        Socket socket = serverSocket.accept();
//
//        System.out.println("服务端: socket="+socket.getClass());
//        //
//        //3.通过socket.getInputStream读取数据通道的数据
//        InputStream inputStream = socket.getInputStream();
//        //4.IO读取
//        byte[] buf = new byte[1024];
//        int readLen = 0;
//        while((readLen= inputStream.read(buf))!=-1){
//            System.out.println(new String(buf,0,readLen));
//        }
//        //5.关闭流和socket
//        inputStream.close();
//        socket.close();
//        serverSocket.close();

        //监听9999
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("服务端, 在9999端口监听,等待链接...");

        Socket socket = serverSocket.accept();
        System.out.println("服务端: socket="+socket.getClass());

        //获取到输入流
        InputStream inputStream = socket.getInputStream();

        //io读取
        byte[] bytes = new byte[1024];
        int len = 0;
        while((len=inputStream.read(bytes))!=-1){
            System.out.println(new String(bytes,0,len));
        }

        //关闭
        socket.close();
        serverSocket.close();
        inputStream.close();

    }
}
