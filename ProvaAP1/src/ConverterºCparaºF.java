import java.util.Scanner;

public class ConverterºCparaºF {
    public static void main(String[] args) {
        Scanner Celsius = new Scanner(System.in);

        System.out.println("Digite a temperatura em Celsius:");
        double Cel = Celsius.nextDouble();

        double concersao = Cel * 1.8 + 32;

        System.out.println("Temperatura convertida para Fahrenheit:" + String.format("%.1f", concersao) + "º");

        Celsius.close();
    }

}
