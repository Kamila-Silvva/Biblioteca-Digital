import java.util.Scanner;
public class Leitura {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String title;
        int anoDeLancamento;
        double nota;

        System.out.println("Digite o Título do Livro");
        title = scanner.nextLine();
        System.out.println("Digite o ano do Livro");
        anoDeLancamento = scanner.nextInt();
        System.out.println("Digite uma nota para o Livro");
        nota = scanner.nextDouble();

        System.out.println("Título: " + title);
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
        System.out.println("Nota da Avaliação: " + nota);
    }
}
