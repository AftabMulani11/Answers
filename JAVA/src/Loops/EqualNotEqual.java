package JAVA.src.Loops;
import java.util.Scanner;
public class EqualNotEqual {
    static void Equal(int a, int b){
        if (a == b){ //equal to operator
            System.out.println("Numbers are equal");
        }
        else if (a != b){ // not equal to operator
            System.out.println("Numbers are not equal");
        }
    }
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = num.nextInt();
        System.out.print("Enter second number: ");
        int b = num.nextInt();
        Equal(a, b);
    }   
}
