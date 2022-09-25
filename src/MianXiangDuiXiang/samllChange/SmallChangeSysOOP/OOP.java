package MianXiangDuiXiang.samllChange.SmallChangeSysOOP;

import java.util.Date;
import java.util.Scanner;

public class OOP {
    /*使用oop
    将各个功能对应一个方法
     */
    private boolean a = true;
    Scanner scanner = new Scanner(System.in);
    private String detail = "============零钱通明细============";
    //3.添加收益入账
    //新增新的变量
    private double income = 0;
    private double balance = 0;
    private Date date = null;//日期
    //消费
    private double outcome =0;
    //退出
    private String choice;

    public void mainMenu(){
        System.out.println("显示主菜单...");
        while (a) {
            System.out.println("\n-------------零钱通菜单(OOP)-------------");
            System.out.println("             1.零钱通明细            ");
            System.out.println("             2.收益入账            ");
            System.out.println("             3.消费            ");
            System.out.println("             4.退出            ");

            System.out.println("输入你的选择(1-4)");
            String key = scanner.next();
            if (key.equals("1")) {
                detail();
            } else if (key.equals("2")) {
                Income();
            } else if (key.equals("3")) {
                Outcome();
            } else if (key.equals("4")) {
                Quit();
            } else {
                System.out.println("选择有误");
            }


        }
        System.out.println("退出了项目");
    }

    private void detail(){
        System.out.println(detail);
    }

    private void Income(){
        System.out.println("收益入账金额: ");
        income=scanner.nextDouble();
        //income的范围效验
        while(income<0){
            System.out.println("收入不能少于0.输入1继续,2退出");
            String logout = scanner.next();
            if(logout.equals("1")){
                System.out.println("收益入账金额: ");
                income=scanner.nextDouble();
            }else if(logout.equals("2")){
                income=0;
                break;
            }else{

            }
        }
        //更新余额
        balance += income;
        //获取时间
        date = new Date();
        //拼接income信息到detail
        detail += "\n收益入账\t+"+ income +"\t" + date+ "\t"+balance;
        date = null;
    }


    private void Outcome(){
        System.out.println("消费金额: ");
        outcome=scanner.nextDouble();
        //income的范围效验  (not yet)
        if(outcome<balance){
            System.out.println("金额不够");
        }else {
            while (outcome < 0) {
                System.out.println("收入不能少于0.输入1继续,2退出");
                String logout = scanner.next();
                if (logout.equals("1")) {
                    System.out.println("收益入账金额: ");
                    outcome = scanner.nextDouble();
                } else if (logout.equals("2")) {
                    outcome = 0;
                    break;
                } else {

                }
            }
            //更新余额
            balance -= outcome;
            //获取时间
            date = new Date();
            //拼接income信息到detail
            detail += "\n消费金额\t-" + outcome + "\t" + date + "\t" + balance;
            date = null;
        }
    }


    private void Quit(){
        while(true){
            System.out.println("确定要退出吗?\t输入\"Y\"确定退出,输入\"N\"取消退出");
            choice = scanner.next();
            if(choice.equals("N")||choice.equals("Y")){
                break;
            }
        }
        if(choice.equals("Y")){
            a = false;
        }
        System.out.println("退出");
    }
}
