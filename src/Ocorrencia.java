import java.util.Scanner;

public class Ocorrencia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a string: ");
        String name = sc.nextLine();
        int contagemMaiuscula = 0, contagemMinuscula = 0;

        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == 'a') {
                contagemMinuscula++;
            } else if (name.charAt(i) == 'A') {
                contagemMaiuscula++;
            }
        }

        System.out.printf("Nome da String: %s\n", name);
        System.out.printf("Quantidade de 'a' minúsculas: %d\n", contagemMinuscula);
        System.out.printf("Quantidade de 'A' maiúsculas: %d\n", contagemMaiuscula);

        sc.close();
    }
}