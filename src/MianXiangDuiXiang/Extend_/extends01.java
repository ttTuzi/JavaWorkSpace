package MianXiangDuiXiang.Extend_;

public class extends01 {
    public static void main(String[] args) {
        Pupil pupil = new Pupil();
        Graduate graduate = new Graduate();
        pupil.Name="小魏";
        pupil.age=10;
        pupil.setScore(100);

        graduate.Name="大魏";
        graduate.age=20;
        graduate.setScore(98);

        graduate.showInfo();
        pupil.showInfo();

    }
}
