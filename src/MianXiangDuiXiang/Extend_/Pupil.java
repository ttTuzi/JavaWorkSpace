package MianXiangDuiXiang.Extend_;

public class Pupil {
    public  String Name;
    public int age;
    private double Score;

    public void setScore(double score) {
        Score = score;
    }

    public void testing(){
        System.out.println("小学生 "+Name+" 正在考小学数学");
    }
    public void showInfo(){
        System.out.println("小学生名字 "+Name+" 年龄 "+age+" 成绩 "+Score);
    }
}
