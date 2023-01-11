package netWork.uploadFile;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 1/10/2023 8:01 PM
 */
public class UploadFileClient01 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(),9999);
        System.out.println("连接成功");

        //get image from local device
        String filePath = "E:\\Kaola.jpg";
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("E:\\Kaola.jpg"));



    }
}
