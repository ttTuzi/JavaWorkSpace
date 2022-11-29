package file_.ObjectOutAndInStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2022年11月22日 3:08 PM
 */
public class ObjectInStream_ {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String data = "e:\\data.dat";
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(data));

        //读取
        //读取的顺序 需要和 保存的顺序一致
        System.out.println(ois.readInt());
        System.out.println(ois.readBoolean());
        System.out.println(ois.readChar());
        System.out.println(ois.readDouble());
        System.out.println(ois.readUTF());
        //readObject()不会调用方法,如果想得到方法需要转型
        Object dog = ois.readObject();
        System.out.println(dog);

        //向下转型来获得Dog
        Dog dog2 = (Dog) dog;
        System.out.println(dog2.getName());
        ois.close();
    }
}
