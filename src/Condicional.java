public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2000;
        String tipoPlano = "Plus";
        int mediaAvaliacao = (8 + 6 + 9) / 3;
        boolean incluidoNoPlano = true;

        if (anoDeLancamento >= 2000) {
            System.out.println("Livro da autalidade");
        } else {
            System.out.println("Livros nostalgico");
        }

        if (tipoPlano.equals("Plus") || incluidoNoPlano) { // para substituir o ==
            System.out.println("Não é necessario pagamento de aluguel");
        } else {
            System.out.println("É necessario o pagamento de aluguel");
        }

        if (mediaAvaliacao > 8){
            System.out.println("Um excelente livro");
        } else if (mediaAvaliacao < 8) {
            System.out.println("Um bom livro");
        }
    }

}

