package JAVA.src.JAVABasics;

public class LocalAndGlobal {
    int a = 73;
    void LocalVariable(){
        int a = 84;
        System.out.println("Local variable is "+a);
    }
    public static void main(String[] args) {
        LocalAndGlobal obj = new LocalAndGlobal();
        System.out.println("Global variable is "+obj.a);
        obj.LocalVariable();

    }
}
