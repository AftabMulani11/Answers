package JAVA.src.Loops;
import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("enter number to check in number even or odd: ");
        int a = num.nextInt();
        if(a%2==0){
            System.out.println("Number is even");
        }
        else{
            System.out.println("Number is odd");
        }
    }
}
