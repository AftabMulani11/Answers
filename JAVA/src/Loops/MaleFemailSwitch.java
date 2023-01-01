package JAVA.src.Loops;
import java.util.Scanner;
public class MaleFemailSwitch {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter M/F:");
        char a = obj.next().charAt(0);
        switch (a) {
            case 'M':
                System.out.println(a + " is Male");
                break;
            case 'F':
            System.out.println(a + " is Female");
            break;
            case 'm':
                System.out.println(a + " is Male");
                break;
            case 'f':
                System.out.println(a + " is Female");
                break;
            default:
                System.out.println("cannot determine");
                break;
        }
        
    }
}
