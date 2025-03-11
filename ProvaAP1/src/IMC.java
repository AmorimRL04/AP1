import java.util.Scanner;

public class IMC{
    public static void main(String[] args) {
        Scanner Medidas = new Scanner(System.in);

        System.out.println("Digite seu peso (Digite o valor com virgula):");
        double peso = Medidas.nextDouble();

        System.out.println("Digite sua altura em cm (Digite o valor com virgula):");
        double altura = Medidas.nextDouble();

        double concersao = peso / (altura * altura);

        System.out.println("o seu IMC é de:" + String.format("%.2f", concersao));

        Medidas.close();
    }

}
