package JAVA.src.Loops;

public class PrimeOrNot {
    static void Prime(int a){
        boolean l = false;
        for(int i = 2; i<= a/2;++i){
            if(a % i == 0){
                l = true;
                break;
            }
        }
        if(!l){
            System.out.println(a + " is a Prime Number");
        }
        else{
            System.out.println(a + " is not a Prime Number");
        }
    }
    public static void main(String[] args) {
        int a = 8;
        Prime(a);
    }
}
