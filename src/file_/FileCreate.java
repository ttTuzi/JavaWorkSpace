package file_;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

/**
 * @Description: 演示创建文件
 * @author: Wei Liang
 * @date: 2022年11月21日 12:49 PM
 */
public class FileCreate {
    public static void main(String[] args) {

    }

    @Test
    //创建文件1:
    //new File(绝对路径)
    //e:\\news.txt
    public void create01(){
        String filePath = "e:\\news.txt";
        File file = new File(filePath); // 内存里边有一个对象,并没有写入到磁盘中
        try {
            file.createNewFile();
            System.out.println("创建成功");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    //创建文件2:
    //new File(File parent, String child)
    //e:\\news2.txt
    @Test
    public void create02(){
        File ParentFile = new File("e:\\");
        String fileName = "news2.txt";
        File file = new File(ParentFile, fileName); // 内存里边有一个对象,并没有写入到磁盘中
        try {
            file.createNewFile();
            System.out.println("创建成功2");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    //创建文件3:
    //new File(String parent, String child)
    //e:\\news3.txt
    @Test
    public void create3(){
        String parentPath = "e:\\";
        String childPath = "new3.txt";
        File file = new File(parentPath,childPath);
        try {
            file.createNewFile();
            System.out.println("创建成功");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
