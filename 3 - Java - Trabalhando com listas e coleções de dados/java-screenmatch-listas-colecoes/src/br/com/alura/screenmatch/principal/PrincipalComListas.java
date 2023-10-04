package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.avalia(9);

        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(9);

        var filmeDoDiego = new Filme("Chapa Quente", 2023);
        filmeDoDiego.avalia(10);

        Serie lost = new Serie("Lost", 2000);

        Filme f1 = filmeDoDiego;

        //Titulo foi parametrizado pois ao utilizar lista de Filme, as séries não serão compiladas
        //Não se utiliza a superclasse Object, pode passar tudo na lista com object
        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoDiego);
        lista.add(meuFilme);
        lista.add(outroFilme);
        //Não compila ao adicionar serie em lista de filme, por isso muda-se para Titulo
        lista.add(lost);

        for (Titulo item: lista) {
            System.out.println(item.getNome());
            //Para pegar a classificação dos filmes na lsita "Filme", preciso dizer que virá de Filme
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
               //Filme filme = (Filme) item;
                System.out.println("Classificação: " + filme.getClassificacao());
            }

        }


    }
}
