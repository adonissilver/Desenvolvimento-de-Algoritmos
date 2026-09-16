import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double altura, raio, volume;

        System.out.print("Digite a altura: ");
        altura = teclado.nextDouble();

        System.out.print("Digite o raio: ");
        raio = teclado.nextDouble();

        volume = Math.PI * Math.pow(raio, 2) * altura;

        System.out.println("O volume do cilindro é: " + volume);

        teclado.close();
    }
}
