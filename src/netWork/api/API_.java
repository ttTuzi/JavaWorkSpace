package netWork.api;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @Description:
 * 演示InetAddress的使用
 * @author: Wei Liang
 * @date: 2023年01月01日 5:41 PM
 */
public class API_ {
    public static void main(String[] args) throws UnknownHostException {
        //获取本机的InetAddress对象
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost);

        //根据指定主机名,获取InetAddress对象
        InetAddress Host1 = InetAddress.getByName("DESKTOP-LRBTUCE");
        System.out.println(Host1);

        //根据域名返回InetAddress对象,比如google.com
        InetAddress Host2 = InetAddress.getByName("www.pornhub.com");
        System.out.println(Host2);


    }
}
