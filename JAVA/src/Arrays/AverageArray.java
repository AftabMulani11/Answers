package JAVA.src.Arrays;

public class AverageArray {
    static void Average(int[] a){
        int s = 0;
        for (int i : a){
            s = s + i;
        }
        int aver = s/a.length;
        System.out.println(aver + " is the average value of array");

    }
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        Average(a);
        
    }
}
