package MianXiangDuiXiang.MianXiangDuiXiangPractice;

public class Pratice_2 {
    public static void main(String[] args) {
        Method m1 = new Method(10,8);
        m1.output();
        System.out.println(m1.area());
    }
}

class Method{
    int c;
    int r;
    public Method(){

    }
    public Method(int c, int r){
        this.c=c;
        this.r=r;
    }
    public void setc(int c){
        this.c=c;
    }
    public void setr(int r){
        this.r=r;
    }
    public int getc(){
        return c;
    }
    public int getr(){
        return r;
    }

    public void output(){
        for(int i=0;i<this.r;i++){
            for(int j=0;j<this.c;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    public int area(){
        return this.c*this.r;
    }

}
