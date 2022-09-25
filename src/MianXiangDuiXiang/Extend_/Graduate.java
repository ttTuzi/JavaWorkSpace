package MianXiangDuiXiang.Extend_;
//大学生类 -》
public class Graduate{
    public  String Name;
    public int age;
    private double Score;

    public void setScore(double score) {
        Score = score;
    }

    public void testing(){
        System.out.println("大学生 "+Name+" 正在考大学数学");
    }
    public void showInfo(){
        System.out.println("大学生名字 "+Name+" 年龄 "+age+" 成绩 "+Score);
    }
}
