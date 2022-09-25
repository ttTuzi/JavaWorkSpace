package MianXiangDuiXiang.interface_;

public class Interface03{
    public static void main(String[] args) {
        MysqlDB mysqlDB = new MysqlDB();
        t(mysqlDB);
        OracleDB oracleDB = new OracleDB();
        t(oracleDB);
    }
    public static void t(DBInterface db){
        db.connect();
        db.close();
    }

}

interface DBInterface{//项目经理
    public void connect();
    public void close();
}

class MysqlDB implements DBInterface{
    @Override
    public void connect() {
        System.out.println("连接mysql");
    }

    @Override
    public void close() {
        System.out.println("关闭mysql");
    }
}

class OracleDB implements DBInterface {
    @Override
    public void connect() {
        System.out.println("连接Oracle");
    }

    @Override
    public void close() {
        System.out.println("关闭Oracle");
    }
}