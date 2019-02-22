import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a = ");
        if (scanner.hasNextInt()) {
            int a = scanner.nextInt();
            System.out.println("a = " + a);
        }
        System.out.println("Done!");

        //task* Змінити один символ, щоб
        //вивело 20 "*"
        /*int N = 20;
        for (int i = 0; i < N; i--) {
            System.out.println("*");
        }*/
    }
}
