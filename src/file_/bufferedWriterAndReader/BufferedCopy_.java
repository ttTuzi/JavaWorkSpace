package file_.bufferedWriterAndReader;

import java.io.*;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2022年11月22日 2:35 PM
 */
public class BufferedCopy_ {
    public static void main(String[] args) throws IOException {
        String filePath = "e:\\story.txt";
        String toFilePath = "e:\\story2.txt";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(toFilePath));
        String data;
        while((data=bufferedReader.readLine())!=null){
            bufferedWriter.write(data);
            bufferedWriter.newLine();
        }
        System.out.println("copy succeed");

        bufferedReader.close();
        bufferedWriter.close();

    }
}
