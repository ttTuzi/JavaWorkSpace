package file_.properties_;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2022年11月29日 12:14 PM
 */
public class Properties01 {
    public static void main(String[] args) throws IOException {

        //read mysql.properties, and get it's ip,user,and pwd
        BufferedReader bufferedReader = new BufferedReader(new FileReader("E:\\JavaWorkSpace\\src\\file_\\mysql.properties"));
        String line = "";
        while((line=bufferedReader.readLine())!=null){
            String[] split = line.split("=");
            System.out.println(split[0]+"值是"+split[1]);
        }
        bufferedReader.close();

    }
}
