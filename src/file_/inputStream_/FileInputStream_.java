package file_.inputStream_;

import file_.FileInformation;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @Description: 读取文件
 * @author: Wei Liang
 * @date: 2022年11月21日 2:27 PM
 */
public class FileInputStream_ {
    public static void main(String[] args) {
        String filePath = "e:\\hello.txt";
        File file = new File(filePath);
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //读取文件内容
    //字节读取bit
    //读取效率低
    @Test
    public void readFile01(){
        String filePath = "e:\\hello.txt";
        int readData=0;
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(filePath);
            while(readData != -1){
                readData = fileInputStream.read();
                System.out.print((char) readData);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }finally {
            //需要关闭文件
            try {
                fileInputStream.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    //读取文件内容
    //字节读取byte
    //读取效率低
    //read(byte[] bytes)
    @Test
    public void readFile02(){
        String filePath = "e:\\hello.txt";
        int readData=0;
        //字节
        byte[] bytes = new byte[8];
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(filePath);
            while((readData = fileInputStream.read(bytes)) != -1){
                System.out.print(new String(bytes,0, bytes.length));
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }finally {
            //需要关闭文件
            try {
                fileInputStream.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
