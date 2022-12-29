package JAVA.src.Loops;

public class ArmstrongNumber {
    static boolean Arms(int n) {
        int r, result = 0;
        int temp = n;
        while (n != 0) {
            r = n % 10;
            result += (r * r * r);
            n = n / 10;
        }
        return temp == result;
    }
    public static void main(String[] args) {
        int num = 153; 
        if (Arms(num)) {
            System.out.println(num + " is an Armstrong number");
        } else {
            System.out.println(num + " is not an Armstrong number");
        }
    }
}