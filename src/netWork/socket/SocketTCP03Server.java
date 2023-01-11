package netWork.socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Description: use byte
 * @author: Wei Liang
 * @date: 1/9/2023 11:34 PM
 */
public class SocketTCP03Server {
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
        //4.IO读取,使用字符流
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String s = bufferedReader.readLine();
        System.out.println(s);



        //5.获取socket相关的输出流
        OutputStream outputStream = socket.getOutputStream();
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
        bufferedWriter.write("hello client 字符流");
        bufferedWriter.newLine();
        bufferedWriter.flush();

        //6.关闭流和socket
        bufferedWriter.close();
        bufferedReader.close();
        socket.close();
        serverSocket.close();
    }
}
