package MianXiangDuiXiang.MianXiangDuiXiangPractice;
/*
定义student类,包含3个属性: 学号number(int),年级state(int),成绩score(int)
创建20个学生,学号1-20, 年级和成绩随机,然后遍历信息
Q1.打印出3年级的学生信息
Q2.所以冒泡排序按学生成绩排序
 */
public class Practice_3 {

    public static void main(String[] args) {
        students[] std = new students[20];
        Practice_3 p1 = new Practice_3();
        p1.setInfo(std);
        p1.Ssort(std);
        p1.print(std);

    }

    public void setInfo(students[] std){
        for(int i=0; i<std.length;i++){
            std[i] = new students();
            std[i].setNumber(i+1);
            std[i].setState((int)(Math.random()*(6))+1);
            std[i].setScore((int)(Math.random()*(101)));
        }
    }
    public void Ssort(students[] std){
        for(int i=0;i<std.length-1;i++){
            int min=i;
            for(int j=i;j<std.length;j++){
                if(std[j].getScore()<std[min].getScore()){
                    min=j;
                }
            }
            students temp = std[min];
            std[min] = std [i];
            std[i] = temp;
        }
    }

    public void print(students[] std){
        for(int i=0; i<std.length;i++){
            System.out.println("Number: "+std[i].getNumber()+", state: "+std[i].getState()+", Score: "+std[i].getScore());
        }
    }


}

class students{
    private int number;
    private int state;
    private int score;
    public students(){

    }
    public students(int number, int state, int score){
        this.number=number;
        this.state=state;
        this.score=score;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }


}
