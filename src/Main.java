public class Main {
    public static void main(String[] args) {
        String welcome = """
                Seja bem vindo!!
                
                Biblioteca Digital
                """;
        System.out.println(welcome);
        String Nome = "Harry Potter";
        int anoDeLancamento = 2000;
        double notaLivro = 8;
        String tipoPlano = "Plus";
        int mediaAvaliacao = (8 + 6 + 9) / 3;
        boolean incluidoNoPlano = true;
        String sinopse = "Um bom livro para ler";

        System.out.println("Title: " + Nome);
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
        System.out.println("Nota do Livro: " + notaLivro);
        System.out.println("Avaliação " + mediaAvaliacao);
        System.out.println("Tipo de Plano: " + tipoPlano);
        System.out.println("Incluido no Plano: " + incluidoNoPlano);
        System.out.println("Sinopse:  " + sinopse);
        
    }
}
