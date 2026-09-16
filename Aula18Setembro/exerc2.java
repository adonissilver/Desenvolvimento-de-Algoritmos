import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int minutos, dias, horas, resto;

        System.out.print("Digite a quantidade de minutos: ");
        minutos = teclado.nextInt();

        dias = minutos / 1440;
        resto = minutos % 1440;

        horas = resto / 60;
        minutos = resto % 60;

        System.out.println("Dias: " + dias);
        System.out.println("Horas: " + horas);
        System.out.println("Minutos: " + minutos);

        teclado.close();
    }
}
