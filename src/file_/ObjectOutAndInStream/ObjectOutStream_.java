package file_.ObjectOutAndInStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @Description: 演示objectOutputStream的使用,完成数据的序列化
 * @author: Wei Liang
 * @date: 2022年11月22日 2:55 PM
 */
public class ObjectOutStream_ {
    public static void main(String[] args) throws IOException {
        //序列化完成或,保存的文本格式,不是文本格式,而是按照他的格式来保存
        String filePath = "e:\\data.dat";

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath));

        //序列化数据到 filePath
        oos.writeInt(100); //int->Integer (实现了 Serializable)
        oos.writeBoolean(true); //boolean -> Boolean
        oos.writeChar('p'); //char -> Char
        oos.writeDouble(123.321); //double -> Double
        oos.writeUTF("Wei Liang"); //String
        oos.writeObject(new Dog("lulu",9,"China","Gold")); //想要object序列化需要 object class implements Serializable
        oos.close();
    }

}

