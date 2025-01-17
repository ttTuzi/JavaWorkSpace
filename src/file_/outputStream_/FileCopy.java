package file_.outputStream_;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Description: copy
 * @author: Wei Liang
 * @date: 2022年11月21日 4:40 PM
 */
public class FileCopy {
    public static void main(String[] args) {
        //copy file,
        // copy e:\\Koala.jpg to c:\\
        //1.create inputStream  to read file
        //2.create outPutStream to write file
        String fileName = "e:\\Kaola.jpg";
        String toFileName = "e:\\Koala6.jpg";
        byte[] bytes = new byte[1024];
        int data = 0;
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            fileInputStream = new FileInputStream(fileName);
            fileOutputStream = new FileOutputStream(toFileName);
            while((data = fileInputStream.read(bytes)) != -1){
                fileOutputStream.write(bytes,0,data);
            }
            System.out.println("拷贝成功");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
