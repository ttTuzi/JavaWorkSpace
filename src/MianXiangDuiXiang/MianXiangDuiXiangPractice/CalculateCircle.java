package MianXiangDuiXiang.MianXiangDuiXiangPractice;

public class CalculateCircle {
    double r;
    public CalculateCircle(){

    }
    public CalculateCircle(int r){
        this.r =r;
    }
    public double area(){
        return Math.PI * r * r;
    }

    public double perimeter(){
        return Math.PI*2*r;
    }
}
