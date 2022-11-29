package file_.properties_;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * @Description: read properties
 * @author: Wei Liang
 * @date: 2022年11月29日 5:15 PM
 */
public class Properties02 {
    public static void main(String[] args) throws IOException {
        //creat the properties object
        Properties p = new Properties();
        //upload file
        p.load(new FileReader("E:\\JavaWorkSpace\\src\\file_\\mysql.properties"));
        //show on the console
        p.list(System.out);
        //base on key, get value
        String user = p.getProperty("user");
        System.out.println(user);
    }
}
