package file_;

import org.junit.jupiter.api.Test;

import java.io.File;

/**
 * @Description: 获取文件相关信息
 * @author: Wei Liang
 * @date: 2022年11月21日 1:37 PM
 */
public class FileInformation {
    public static void main(String[] args) {

    }

    //获取文件信息
    @Test
    public void info(){
        //创建文件对象
        File file = new File("e://news.txt");

        //调用方法获取文件名
        System.out.println(file.getName());
        //绝对路径
        System.out.println(file.getAbsoluteFile());
        //父目录
        System.out.println(file.getParentFile());
        //文件大小,字节计算
        System.out.println(file.length());
        //是否纯在
        System.out.println(file.exists());
        //是否是目录
        System.out.println(file.isDirectory());
    }
}
