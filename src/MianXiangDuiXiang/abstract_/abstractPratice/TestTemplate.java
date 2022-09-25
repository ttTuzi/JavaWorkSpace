package MianXiangDuiXiang.abstract_.abstractPratice;

public class TestTemplate {
    public static void main(String[] args) {
        Template aa = new AA();
        aa.calculateTimes();

        Template bb = new BB();
        bb.calculateTimes();
    }
}

abstract class Template {
    int sum=0;
    public abstract void job();

    public void calculateTimes() {
        long start = System.currentTimeMillis();
        job();
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}

class AA extends Template {
    @Override
    public void job() {
        for (int i = 0; i < 1000000; i++) {
            sum += i;
        }
        System.out.println("AA: "+sum);
    }
}

class BB extends Template {
    @Override
    public void job() {
        for (int i = 0; i < 500000; i++) {
            sum += i;
        }
        System.out.println("BB: "+sum);
    }
}

