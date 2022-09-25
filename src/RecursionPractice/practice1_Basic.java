package RecursionPractice;

public class practice1_Basic {
    public static void main(String[] args) {
        int n=10;
        practice1_Basic p1 = new practice1_Basic();
        p1.test(n);
        System.out.println("");
        p1.test2(n);
    }
    // print 1 to n
    public void test(int n){
        if(n>1){
            test(n-1);
        }
        System.out.print(n+", ");
    }
    //print n to 1
    public void test2(int n){
        if(n>=1){
            System.out.print(n+", ");
            test2(n-1);
        }
    }
}
