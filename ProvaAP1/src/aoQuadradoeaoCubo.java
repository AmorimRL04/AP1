import java.util.Scanner;

public class aoQuadradoeaoCubo{
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);

        System.out.println("Digite um número:");
        double valor = numero.nextDouble();

        double quadrado = Math.pow(valor, 2);
        double aocubo = Math.pow(valor, 3);


        System.out.println(" O " + String.format("%.0f", valor) + " ao quadrado é: " + quadrado +
        "\n O " + String.format("%.0f", valor)+ " ao cubo é: "  + aocubo );

        numero.close();
    }

}
