package school.mjc.stage0.conditions.task4;

public class MaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        int max = Math.max(first,second);
        if(max>second){
            max = Math.max(first,third);
        } else{
            max = Math.max(second,third);
        }
        System.out.println(max);
    }
}
