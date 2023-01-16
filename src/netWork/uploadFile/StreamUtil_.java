package netWork.uploadFile;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2023年01月11日 12:59 PM
 */


public class StreamUtil_ {
    public static byte[] ReadFileToByte(InputStream inputStream) throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        byte[] bytes = new byte[1024];
        int len=0;
        while((len=inputStream.read(bytes))!=-1){
            bos.write(bytes,0,len);
        }
        byte[] array = bos.toByteArray();
        bos.close();
        return array;
    }

//    public static String byteToString(){
//
//    }
}
