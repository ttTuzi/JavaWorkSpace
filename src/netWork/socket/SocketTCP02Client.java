package netWork.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 1/9/2023 11:34 PM
 */
public class SocketTCP02Client {
    public static void main(String[] args) throws IOException {
                //思路:
        //链接服务端(ip,端口)
        //解读: 链接InetAddress.getLocalHost()(本机)的ip的9999端口
        //      链接成功则返回socket对象
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        System.out.println("客户端: Socket返回= "+socket.getClass());
        //2.连接成功后,生成Socket, 通过socket.getOutputStream()
        //  得到和这个socket关联的输出流对象
        OutputStream outputStream = socket.getOutputStream();
        //3.通过输出流,写入数据到数据通道
        outputStream.write("hello, server".getBytes());
        //需要设置一个结束标记
        socket.shutdownOutput();
        //4.获取和socket相关的数据
        InputStream inputStream = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int len=0;
        while ((len=inputStream.read(bytes))!=-1){
            System.out.println(new String(bytes,0,len));
        }

        //5. 关闭流对象和Socket,必须关闭
        outputStream.close();
        inputStream.close();
        socket.close();
        System.out.println("客户端退出了");
    }
}
