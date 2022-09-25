package RecursionPractice;

public class practice5_MonkeyEatPeach {
    public static void main(String[] args) {
        practice5_MonkeyEatPeach p1 = new practice5_MonkeyEatPeach();
        System.out.println(p1.Monkey(10));
    }

    //猴子吃桃子问题:有一堆桃子,猴子第一天吃了其中的一半,并再多吃了一个!
    // 以后每天猴子都吃其中的一半,然后再多吃一个。
    // 当到第10天时,想再吃时(即还没吃),发现只有1个桃子了。
    // 问题:最初共多少个桃子？
    //算数草稿在goodnote
    public int Monkey(int n){
        if(n==1){
            return 1;
        }else {
            return (Monkey(n - 1)+1)*2;
        }
    }
}
