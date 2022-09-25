package MianXiangDuiXiang.poly.polyArr;

public class Student extends Person {
    private double score;

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Student(String name, int age, double score) {
        super(name, age);
        this.score = score;
    }

    @Override
    public String say() {
        return super.say()+" score = "+score;
    }
}
