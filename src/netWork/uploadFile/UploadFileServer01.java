package netWork.uploadFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 1/10/2023 8:02 PM
 */
public class UploadFileServer01 {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("等待连接ing...");

        Socket socket = serverSocket.accept();
        System.out.println("连接成功");

        InputStream inputStream = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int len=0;
        String toFileName = "e:\\Koala2.jpg";
        FileInputStream fileInputStream = null;
        while((len=inputStream.read(bytes))!=-1){

        }
    }
}
