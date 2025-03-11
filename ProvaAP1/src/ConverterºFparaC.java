import java.util.Scanner;

public class ConverterºFparaC {
    public static void main(String[] args) {
        Scanner Fahrenheit = new Scanner(System.in);

        System.out.println("Digite a temperatura em Fahrenheit:");
        double Fah = Fahrenheit.nextDouble();

        double concersao = ( Fah - 32 ) * 5/9;

        System.out.println("Temperatura convertida para Celsius:" + String.format("%.1f", concersao) + "º");

        Fahrenheit.close();

    }

}
