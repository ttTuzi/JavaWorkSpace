package netWork.socket;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 1/9/2023 11:34 PM
 */
public class SocketTCP03Client {
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
        //3.通过输出流,写入数据到数据通道,要求使用字符流
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
        bufferedWriter.write("hello,Server");
        bufferedWriter.newLine();//插入换行符,表示写入结束,但是要求对方使用readLine()!!!
        bufferedWriter.flush();  //如果使用字符流,必须手动刷新,否则数据不会进入数据通道

        //4.获取和socket相关的数据
        InputStream inputStream = socket.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String s = bufferedReader.readLine();
        System.out.println(s);

        //5. 关闭流对象和Socket,必须关闭
        bufferedReader.close();//关闭外层流
        bufferedWriter.close(); //关闭外层流
        socket.close();
        System.out.println("客户端退出了");
    }
}
