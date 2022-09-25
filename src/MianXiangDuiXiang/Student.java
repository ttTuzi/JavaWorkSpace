package MianXiangDuiXiang;
//Practice extends
//Pratice super : use parent's method
public class Student extends People{
    private String Job ;
    public String getJob(){
        return this.Job;
    }
    public void setJob(String Job){
        this.Job=Job;
    }
    public void tostring(){
        super.tostring();
        System.out.println(" and the Job is "+this.Job);
    }
}
