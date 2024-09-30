import java.util.Locale;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite quantas sequências do número de fibonacci voce quer: ");
        int num = sc.nextInt();

        fibonacci(num);

    }

    public static void fibonacci(int num){
        int a = 0, b = 1;
        System.out.print(a + " " + b + " ");

        for (int i = 2; i < num; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }

    }
}
