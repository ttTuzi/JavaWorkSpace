package Collection__.HW;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2022年11月09日 4:33 PM
 */
public class HW1 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new News("新冠确诊人数超千万,数百万计的印度教徒港服河水洗澡"));
        arrayList.add(new News("男子想起两个月前钓的鱼还在口袋里,拿起一看赶紧放生"));
        Collections.reverse(arrayList);
        for (Object o : arrayList) {
            News news = (News)o;
            if(news.toString().length()>15){
                System.out.println(news.toString().substring(0,15)+"...");
            }else{
                System.out.println(news.toString());
            }
        }
    }
}

class News{
    private String title;
    private String content;

    public News(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return title;
    }
}
