package MianXiangDuiXiang.Extend_.improve_;
//父类，pupil和graduate的父类
public class Student {
    //共有属性
    public  String Name;
    public int age;
    private double Score;

    //共有方法
    public void setScore(double score) {
        Score = score;
    }
    public void showInfo(){
        System.out.println("名字 "+Name+" 年龄 "+age+" 成绩 "+Score);
    }
}
