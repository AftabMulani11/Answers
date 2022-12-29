package JAVA.src.Operators;
import java.util.Scanner;
public class EqualNoEqual {
    static void Equal(int a, int b){
        if (a == b){ //equal to operator
            System.out.println("a and b are equal");
        }
        else if (a != b){ // not equal to operator
            System.out.println("a and b are not equal");
        }
        else{
            System.out.println("can not define");
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
