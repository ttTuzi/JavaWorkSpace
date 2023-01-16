package netWork.uploadFile;

import java.io.*;
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

        //connect to server
        Socket socket = new Socket(InetAddress.getLocalHost(),9999);
        System.out.println("连接成功");

        //get image from local device
        String filePath = "E:\\Kaola.jpg";
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("E:\\Koala.jpg"));

        //read file data and store in byte[]
        byte[] bytes = StreamUtil_.ReadFileToByte(bufferedInputStream);
        bufferedInputStream.close();

        //creat pipe from socket
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(socket.getOutputStream());
        //send data
        bufferedOutputStream.write(bytes);
        socket.shutdownOutput();//set ending flag

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String s = bufferedReader.readLine();
        System.out.println(s);
        bufferedReader.close();

        //close pipe
        bufferedOutputStream.close();
        socket.close();


//        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(filePath));
//
//        byte[] bytes = StreamUtil_.ReadFileToByte(bis);
//        bis.close();
//
//        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
//        bos.write(bytes);
//        socket.shutdownOutput();
//
//        bos.close();
//        socket.close();

    }
}
