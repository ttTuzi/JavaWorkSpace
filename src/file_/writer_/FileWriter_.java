package file_.writer_;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2022年11月22日 1:15 PM
 */
public class FileWriter_ {
    public static void main(String[] args) {
        String filePath = "e:\\note.txt";
        FileWriter fileWriter = null;
        char[] chars = {'a','b','c','d'};
        try {
            fileWriter = new FileWriter(filePath,true);
            fileWriter.write("sdasd");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
