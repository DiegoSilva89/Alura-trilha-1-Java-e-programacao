package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Titulo;
import br.com.alura.screenmatch.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PricipalComBusca {

    //para requisitar informações
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um filme para busca: ");
        var busca = leitor.nextLine();

        //para tornar a busca dinamica na API
        String endereco = "http://www.omdbapi.com/?t=" + busca + "&apikey=718a4e69";

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

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .create();


        TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);
        System.out.println(meuTituloOmdb);
        Titulo meuTitulo = new Titulo(meuTituloOmdb);
        System.out.println("Titulo já convertido");
        System.out.println(meuTitulo);
    }
}
