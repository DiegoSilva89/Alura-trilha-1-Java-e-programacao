import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        //solicita para que seja digitado um CEP para consulta
        Scanner leitura = new Scanner(System.in);
        ConsultaCep consultaCep = new ConsultaCep();

        System.out.println("Digite o CEP: ");
        var cep = leitura.nextLine();

        //Tratamento de exceção para caso de erro ao gerar o arquivo
        try {
            Endereco novoEndereco = consultaCep.buscaEndereco(cep);
            System.out.println(novoEndereco);
            GeradorDeArquivo gerador = new GeradorDeArquivo();
            gerador.GeradorJson(novoEndereco);
        } catch (RuntimeException | IOException e) {
            System.out.println(e.getMessage());
            System.out.println("Finalizando a aplicação");
        }

    }
}
