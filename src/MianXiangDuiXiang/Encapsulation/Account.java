package MianXiangDuiXiang.Encapsulation;

//创建程序,在其中定义两个类: Account 和AccountTest类体会Java的封装性。
// Account类要求具有属性:姓名(长度为2位3位或4位)、余额(必须>20)、
// 密码(必须是六位),如果不满足,则给出提示信息,并给默认值(程序员自己定)
// 通过setXxx的方法给Account 的属性赋值。
// 在AccountTest中测试
public class Account {
//为了封装,全设置为private
    private String name;
    private double balance;
    private String password;

    public Account() {
    }

    public Account(String name, double balance, String password) {
        this.setBalance(balance);
        this.setName(name);
        this.setPassword(password);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length()<=4 && name.length()>=2){
            this.name = name;
        }else{
            System.out.println("不符合长度,使用默认 : 无名氏");
            this.name = "无名氏";
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if(balance>20.0) {
            this.balance = balance;
        }else{
            System.out.println("余额不对, 默认为0");
            this.balance = 0;
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(password.length()==6) {
            this.password = password;
        }else{
            this.password = "000000";
            System.out.println("密码长度不对,必须6位数.默认值是000000");
        }
    }

    public void info(){
        System.out.println("Name is: "+this.name+", balance is: "+this.balance+", 密码是: "+this.password);
    }
}


