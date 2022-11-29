package file_.bufferedWriterAndReader;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2022年11月22日 2:28 PM
 */
public class BufferedWriter_ {
    public static void main(String[] args) throws IOException {
        String filePath = "e:\\ok.txt";
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath));
        bufferedWriter.write("hsp1");
        bufferedWriter.write("hsp2");
        bufferedWriter.write("hsp3");
        bufferedWriter.close();
    }
}
