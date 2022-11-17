package thread_;

/**
 * @Description: 查看cpu
 * @author: Wei Liang
 * @date: 2022年11月17日 1:55 PM
 */
public class CPUNum {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        int cpuNums = runtime.availableProcessors();
        System.out.println("CPU的个数"+cpuNums);
    }
}
