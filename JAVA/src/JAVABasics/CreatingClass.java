package JAVA.src.JAVABasics;
/*
   CreatingClass
*/
public class CreatingClass {
    void myTest(){/*Creating Method */
        String a = "Hello World !!";
        System.out.println(a);
    }

    public static void main(String[] args) {
        CreatingClass obj = new CreatingClass(); /*Creating Object*/
        obj.myTest();/*method call */

    }
}