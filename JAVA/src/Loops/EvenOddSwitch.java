package JAVA.src.Loops;
import java.util.Scanner;
public class EvenOddSwitch {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("enter nymber to check number even or odd:");
        int a = obj.nextInt();
        switch (a % 2) {
            case 0:
                System.out.println(a + " is even number");
                break;
            case 1:
            System.out.println(a + " is odd number");
            default:
                break;
        }
        
    }
}
