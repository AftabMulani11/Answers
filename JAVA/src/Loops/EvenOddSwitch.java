package JAVA.src.Loops;
import java.util.Scanner;
public class EvenOddSwitch {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("enter nymber to check prime or not:");
        int a = obj.nextInt();
        switch (a % 2) {
            case 0:
                System.out.println(a + " is prime number");
                break;
            case 1:
            System.out.println(a + " is not prime number");
            default:
                break;
        }
        
    }
}
