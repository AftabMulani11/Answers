package JAVA.src.Operators;

public class IncrementDecrement {
    static void preIncre(int a, int b){
        int d;
        d = b +(++a);
        System.out.println("values after Pre-Increment are a = "+ a +" and b = " + d );
    }
    static void postIncre(int a, int b){
        int d;
        d = b +(a++);
        System.out.println("values after Post-Increment are a = "+ a +" and b = " + d );
    }
    static void preDecre(int a, int b){
        int d;
        d = b +(--a);
        System.out.println("values after Pre-Decrement are a = "+ a +" and b = " + d );
    }
    static void postDecre(int a, int b){
        int d;
        d = b +(a--);
        System.out.println("values after Post-Decrement are a = "+ a +" and b = " + d );
    }
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        preIncre(a, b);
        postIncre(a, b);
        preDecre(a, b);
        postDecre(a, b);
    }
    
}
