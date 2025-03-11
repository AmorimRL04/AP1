import java.util.Scanner;

public class AreaTriangulo{

    public static void main(String[] args) {
        Scanner Medidas = new Scanner(System.in);

        System.out.println("Digite o valor da base (Digite o valor com virgula):");
        double base = Medidas.nextDouble();

        System.out.println("Digite a altura (Digite o valor com virgula):");
        double altura = Medidas.nextDouble();

        double concersao = (base * altura) / 2;

        System.out.println("A área do triangulo é: " + String.format("%.2f", concersao));

        Medidas.close();
    }

}
