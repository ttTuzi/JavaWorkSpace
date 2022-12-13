package file_.properties_;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * @Description: writer112
 * @author: Wei Liang
 * @date: 2022年11月29日 5:21 PM
 */
public class properties3{
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();

        properties.setProperty("charset","utf8");
        properties.setProperty("user","Tom");
        properties.setProperty("pwd","abc111");

        properties.store(new FileWriter("E:\\JavaWorkSpace\\src\\file_\\mysql.properties"),null);
    }
}
