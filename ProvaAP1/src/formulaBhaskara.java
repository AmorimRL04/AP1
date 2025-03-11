import java.util.Scanner;

public class formulaBhaskara{
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);

        System.out.println("Digite o valor de a:");
        double a = numero.nextDouble();

        System.out.println("Digite o valor de b:");
        double b = numero.nextDouble();

        System.out.println("Digite o valor de c:");
        double c = numero.nextDouble();

        double delta = Math.pow(b, 2) - 4 * a * c;

        double x1 = (-b + Math.sqrt(delta)) / (2 * a);
        double x2 = (-b - Math.sqrt(delta)) / (2 * a);


        System.out.println("O valor de Delta é: " + delta +
                "\nO x1 é: " + x1 +
                "\nE o x2 é: " + x2);

        numero.close();
    }

}
