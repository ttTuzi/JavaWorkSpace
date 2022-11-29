package file_.reader_;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2022年11月21日 5:03 PM
 */
public class FileReader_ {
    public static void main(String[] args) {
        //1.创建fileReader
        String filepath = "e:\\story.txt";
        FileReader fileReader = null;
        int data = 0;
        try {
            fileReader=new FileReader(filepath);
            while((data=fileReader.read())!=-1){
                System.out.print((char) data);
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
