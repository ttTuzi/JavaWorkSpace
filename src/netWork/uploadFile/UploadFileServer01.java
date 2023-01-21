package netWork.uploadFile;

import java.io.*;
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

        //read data from client
        BufferedInputStream bufferedInputStream = new BufferedInputStream(socket.getInputStream());
        byte[] bytes = StreamUtil_.ReadFileToByte(bufferedInputStream);

        //store data to local
        String des = "E:\\Koala4.jpg";
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(des));
        bufferedOutputStream.write(bytes);
        bufferedOutputStream.close();

        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bufferedWriter.write("received");
        bufferedWriter.newLine();
        bufferedWriter.flush();
        bufferedWriter.close();

        //close
        bufferedInputStream.close();
        socket.close();
        serverSocket.close();
    }
}
