package lab8;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println(1/0);
        } catch (ArithmeticException e) {
            System.out.println(":(");
        }


            /*throws Exception {
//        myMethod();
//        try {
            throw new Exception();*/

        /*} catch (Exception e) {
            e.printStackTrace();
        }*/
    }

    private static void myMethod() /*throws Exception*/ /*throws Exception*/ {
        System.err.printf("123");
        myMethod2(-1);
    }

    private static void myMethod2(int a) /*throws Exception*/ {
        System.out.printf("qwe");
        if (a > 0) {
            if (2 != 2) {
//                throw new Exception();
            }
        }
        /*try {
            if (true) {
                throw new Exception();
            }
            System.out.printf(":(");
        } catch (Exception e) {
            System.out.printf("Oups...");
        }*/
    }
}
