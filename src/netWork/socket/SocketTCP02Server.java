package netWork.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 1/9/2023 11:34 PM
 */
public class SocketTCP02Server {
    public static void main(String[] args) throws IOException {
                //1.在本机的9999端口监听,等待链接
        //  细节: 要求在本机没有其他服务在监听9999
        //  细节: ServerSocket可以通过accept()返回对个socket
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("服务端, 在9999端口监听,等待链接...");
        //2.当没有客户端链接9999时,程序堵塞,等待链接
        //  如果有客户端则会返回socket对象,程序进行
        Socket socket = serverSocket.accept();

        System.out.println("服务端: socket="+socket.getClass());
        //
        //3.通过socket.getInputStream读取数据通道的数据
        InputStream inputStream = socket.getInputStream();
        //4.IO读取
        byte[] buf = new byte[1024];
        int readLen = 0;
        while((readLen= inputStream.read(buf))!=-1){
            System.out.println(new String(buf,0,readLen));
        }
        //这里写不写都无所谓,因为我们已经读取到client的shutDownOutput的信息了
        //所以在服务器端可以知道server的这段对话结束,所以可以开始发送信息
        //而我们发送完这个信息之后client就直接关闭了,所以让不让client无所谓
        //如果client还有回复,就必须加上shutdownInput()
        socket.shutdownInput();

        //5.
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("hello, client".getBytes());

        //6.关闭流和socket
        inputStream.close();
        outputStream.close();
        socket.close();
        serverSocket.close();
    }
}
