public class Main {
    public static void main(String[] args) {
        m1();
        m1(1.2);
        m1(2);
        m1("#@)₴?$0");

        int a = 1;
        m(a);
        Integer i = null/*new Integer(1)*/;
//        mm(i/*.intValue()*/);
        mmm();
    }

    static void m(Integer i){

    }

    static void mm(int i){

    }

    static int mmm() {
//        Integer i = null;
        return (true ? null : 0);
    }


    private static void m1() {
        System.out.println("In m1()");
    }

    private static void m1(int i) {
        System.out.println("In m1(" + i + ") - int");
    }
    private static void m1(String i) {
        System.out.println("In m1(" + i + ") - String");
    }

    private static void m1(double i) {
        System.out.println("In m1(" + i + ") - double");
    }
}
