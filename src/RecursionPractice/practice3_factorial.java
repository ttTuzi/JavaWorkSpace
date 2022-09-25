package RecursionPractice;

public class practice3_factorial {
    public static void main(String[] args) {
        practice3_factorial p1 = new practice3_factorial();
        int n = p1. factorial(10);
        System.out.println(n);

    }
    public int factorial(int n){
        if(n!=1){
            return n*factorial(n-1);
        }else{
            return 1;
        }

    }
}
