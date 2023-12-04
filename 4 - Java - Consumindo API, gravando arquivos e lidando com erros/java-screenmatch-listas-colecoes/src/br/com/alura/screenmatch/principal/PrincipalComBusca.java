package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.excecao.ErroDeConversaoDeAnoException;
import br.com.alura.screenmatch.modelos.Titulo;
import br.com.alura.screenmatch.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalComBusca {

    //para requisitar informações
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner leia = new Scanner(System.in);
        String busca = "";
        List<Titulo> titulos = new ArrayList<>();
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        while (!busca.equalsIgnoreCase("sair")) {

            System.out.println("Digite um filme para busca: ");
            busca = leia.nextLine();

            if(busca.equalsIgnoreCase("sair")) {
                break;
            }

            //para tornar a busca dinamica na API
            String endereco = "http://www.omdbapi.com/?t=" + busca.replace(" ", "+") + "&apikey=718a4e69";
            System.out.println(endereco);

            try {
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(endereco))
                        .build();
                //Para obter resposta
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                //solicitando para imprimir o json do filme, da API
                String json = response.body();
                System.out.println(json);

                TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);
                System.out.println(meuTituloOmdb);

                //para verificar se houver erro, realizar o um tratamento de exceção
                //try {
                Titulo meuTitulo = new Titulo(meuTituloOmdb);
                //o que estou buscando, e o "e" é o nome dado a variável convertida de uma String
                System.out.println("Titulo já convertido");
            /* toda variável que declararmos dentro de um método só vale dentro das chaves do método,
            a não ser que seja um atributo */
                System.out.println(meuTitulo);

                titulos.add(meuTitulo);
            } catch (NumberFormatException e) {
                System.out.println("Aconteceu um erro: ");
                System.out.println(e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("Algum erro de argumento na busca, verifique o endereço");
            } catch (ErroDeConversaoDeAnoException e) {
                System.out.println(e.getMessage());
            }

        }

        System.out.println(titulos);

        FileWriter escrita = new FileWriter("filmes.json");
        //Para converter o texto para Json
        escrita.write(gson.toJson(titulos));
        escrita.close();

        System.out.println("O programa finalizou corretamente!");


    }
}
