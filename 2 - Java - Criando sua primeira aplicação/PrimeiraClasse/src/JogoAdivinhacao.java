import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {

        int numero;
        int tentativa = 0;
        int numeroAleatorio = new Random().nextInt(100);
        int chances = 5;

        Scanner leitor = new Scanner(System.in);

        while (tentativa <= 5) {
            System.out.println("Em " + chances + " tentativas, adivinhe o número sorteado: ");
            numero = leitor.nextInt();
            tentativa++;
            chances--;

            if (numero == numeroAleatorio) {
                System.out.println("Você acertou! O número sorteado é: " + numeroAleatorio);
                break;
            } else {
                if (numeroAleatorio > numero) {
                    System.out.println("Dica: O número sorteado é maior");
                } else {
                    if (numeroAleatorio < numero) {
                        System.out.println("Dica: O número sorteado é menor");
                    }
                }
            }
            if (tentativa == 5) {
                System.out.println("Você falhou!");
            }
        }
    }
}
