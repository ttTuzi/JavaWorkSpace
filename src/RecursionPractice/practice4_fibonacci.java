package RecursionPractice;

public class practice4_fibonacci {
    public static void main(String[] args) {
        practice4_fibonacci p1 = new practice4_fibonacci();
        int i = p1.fib(10);
        System.out.println(i);
    }

    //fibona number practice
    //fibona number is 1,1,2,3,5,8,13.....
    public int fib(int n){
        if(n==1 || n==2){
            return 1;
        }
        return fib(n-1) + fib(n-2);
    }
}
