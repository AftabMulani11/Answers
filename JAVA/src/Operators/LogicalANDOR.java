package JAVA.src.Operators;
public class LogicalANDOR {
    public static void main(String[] args) {
        int a = 80;
        int b = 55;
        int c = 40;
        /*
         * && is a logical AND
         * || is logical OR
         * !() is Logical NOT
         */ 
        System.out.println(a > b && a > c); 
        System.out.println(a < b && a < c); 
        System.out.println(a > b && a < c);
        System.out.println(a > b || a > c); 
        System.out.println(a < b || a < c); 
        System.out.println(a < b || a > c);
        System.out.println(!(a > b));
        System.out.println(!(a < b));
        
    }
}
