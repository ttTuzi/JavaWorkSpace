package MianXiangDuiXiang.innerClass.anonymousInnerClass;

public class InnerclassExercise02 {
    public static void main(String[] args) {
        CellPhone cellPhone = new CellPhone();
        cellPhone.alarmClock(new Bell(){
            public void ring(){
                System.out.println("懒猪起床了");
            }
        });
        cellPhone.alarmClock(new Bell() {
            @Override
            public void ring() {
                System.out.println("小伙伴们起床了");
            }
        });

    }

}
interface Bell{
    void ring();
}
class CellPhone{
    public void alarmClock(Bell bell){
        System.out.println(bell.getClass());
        bell.ring();
    }
}
