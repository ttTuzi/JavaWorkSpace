package MianXiangDuiXiang.innerClass.anonymousInnerClass;

public class InnerclassExercise01 {
    public static void main(String[] args) {
        //密名内部类可以当做传仓
        f1(new AA() {
            @Override
            public void show() {
                System.out.println("这是一个名画");
            }
        });
    }
    public static void f1(AA aa){
        aa.show();
    }
}

interface AA{
    void show();
}
