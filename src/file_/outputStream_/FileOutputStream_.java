package file_.outputStream_;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2022年11月21日 3:14 PM
 */
public class FileOutputStream_ {
    public static void main(String[] args) {

    }

    //写入文件
    //如果文件不存在,自动创建文件并写入
    //write();
    @Test
    public void writeFile(){
        String filePath = "e:\\a.txt";
        FileOutputStream fileOutputStream = null;
        try {
            //fileOutputStream = new FileOutputStream(filePath);会覆盖原先内容
            //fileOutputStream = new FileOutputStream(filePath);

            //如果append = true, 则追加的方法
            fileOutputStream = new FileOutputStream(filePath,true);

            //写入字节
            fileOutputStream.write('H');

            //写入字符串
            String str = "hello,world ";
            fileOutputStream.write(str.getBytes());

            System.out.println("写入成功");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
