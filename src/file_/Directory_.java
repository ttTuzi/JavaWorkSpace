package file_;

import org.junit.jupiter.api.Test;

import java.io.File;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2022年11月21日 1:45 PM
 */
public class Directory_ {
    public static void main(String[] args) {

    }

    @Test
    public void m1(){
        String filePath = "e:\\news.txt";
        File file = new File(filePath);
        if(file.exists()){
            if(file.delete()){
                System.out.println("删除成功");
            }
        }else{
            System.out.println("该文件不存在");
        }
    }

    //在java中,目录被当成文件
    //判断:e:\\demo2,是否存在,如果有,就删除
    @Test
    public void m2(){
        String filePath = "c:\\demo2";
        File file = new File(filePath);
        if(file.exists()){
            if(file.delete()){
                System.out.println("删除成功");
            }
        }else{
            System.out.println("该文件不存在");
        }
    }

    //判断d:\\demo\\a\\b\\c 目录是否存在,如果存在,就提示存在,则创建
    @Test
    public void m3(){
        String directoryPath = "e:\\demo\\a\\b\\c";
        File file = new File(directoryPath);
        if(file.exists()){
            System.out.println("file exist");
        }else{
            if(file.mkdirs()){
                System.out.println("creation succeed");
            }
        }
    }

}
