package JAVA.src.Loops;
import java.util.Scanner;
public class IfElseGreater {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter First Number:");
        int a = obj.nextInt();
        System.out.print("Enter Second Number:");
        int b = obj.nextInt();
        System.out.print("Enter Third Number:");
        int c = obj.nextInt();
        if(a>b && a>c)
        {
            System.out.println(a+" is bigger number");
        }
        else if(b>a && b>c){
            System.out.println(b+" is bigger number");
        }
        else{
            System.out.println(c+" is bigger number");
        }
    }
}
