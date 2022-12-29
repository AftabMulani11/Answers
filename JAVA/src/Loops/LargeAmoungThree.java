package JAVA.src.Loops;
import java.util.Scanner;
public class LargeAmoungThree {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int a = num.nextInt();
        System.out.print("Enter Second Number: ");
        int b = num.nextInt();
        System.out.print("Enter Third Number: ");
        int c = num.nextInt();
        if(a>b && a>c){
            System.out.println(a+" is Bigger Number");
        }
        else if(b>a && b>c){
            System.out.println(b+" is Bigger Number");
        }
        else{
            System.out.println(c+" is Bigger number");
        }
        
    }
}
