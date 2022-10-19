package enumerationAndAnnotation.enum_.enumPractice;

//Q:声明Week enum类,包含周一到周日的定义;
//MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY
//使用values返回周一到周五的中文
public class Exercise01 {
    public static void main(String[] args) {
        Week[] value = Week.values();
        for(Week val : value ){
            System.out.println(val.toString());
        }
    }
}

enum Week{
    MONDAY("星期一"),TUESDAY("星期二"),WEDNESDAY("星期三"),
    THURSDAY("星期四"),FRIDAY("星期五"),SATURDAY("星期六"),SUNDAY("星期天");

    private String Day;
    private Week(String day) {
        Day = day;
    }
    public String toString(){
        return Day;
    }
}

