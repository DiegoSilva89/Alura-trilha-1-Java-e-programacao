class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        double notaDoFilme = 8.1;

        //Média calculada por 3 notas de críticos
        double media = (9.8 + 6.3 + 8.0) / 3;
        boolean incluidoNoPlano = true;
        String sinopse;
        sinopse = """
                Filme Top Gun
                Filme de aventura sobre aviões
                muito bom!
                Ano de lançamento
                """ + anoDeLancamento;

        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println(media);
        System.out.println(sinopse);

        //Casting para converter um tipo de dado em outro
        int classificacao = (int) (media / 2);
        System.out.println(classificacao);
    }
}