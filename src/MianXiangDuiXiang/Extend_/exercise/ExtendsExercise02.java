package MianXiangDuiXiang.Extend_.exercise;

public class ExtendsExercise02 {
    public static void main(String[] args) {
        PC pc = new PC("12500k",16,3000,"MSI");
        Notepad notepad = new Notepad("IPad Air 5",12,512,"Black");
        pc.Info();
        notepad.Info();
    }
}

class Computer{
    private String CPU;
    private int memory;
    private int disk;

    public Computer(String CPU, int memory, int disk) {
        this.CPU = CPU;
        this.memory = memory;
        this.disk = disk;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getDisk() {
        return disk;
    }

    public void setDisk(int disk) {
        this.disk = disk;
    }
    public String getDetail(){
        return "cpu="+CPU+ " memory="+memory+" disk="+disk ;
    }
}

class PC extends Computer{
    private String brand;
    public PC(String CPU, int memory, int disk,String brand){
        super(CPU,memory,disk);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void Info(){
        System.out.print("PC=");
        System.out.println(getDetail()+" Brand="+brand);
    }
}

class Notepad extends Computer{
    private String color;
    public Notepad(String CPU, int memory, int disk,String color){
        super(CPU,memory,disk);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void Info(){
        System.out.print("NotePad=");
        System.out.println(getDetail()+" color="+color);
    }
}

