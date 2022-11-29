package file_.bufferedWriterAndReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2022年11月22日 1:44 PM
 */
public class BufferedReader_ {
    public static void main(String[] args) throws Exception {
        String filePath = "e:\\story.txt";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
        String data;
        //readLine
        // 读取完毕返回null
        while((data=bufferedReader.readLine())!=null){
            System.out.println(data);
        }

        //需要关闭流
        bufferedReader.close();


    }
}
