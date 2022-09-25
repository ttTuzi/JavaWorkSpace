package RecursionPractice;

public class practice2_Basic {
    public static void main(String[] args) {
        practice2_Basic p1 = new practice2_Basic();
        p1.test(4);
    }

    // because of else, it only print 1
    public void test(int n){
        if(n>1){
            test(n-1);
        }else {
            System.out.print(n + ", ");
        }
    }
}
