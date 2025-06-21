import java.util.Scanner;

public class Ex16{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do produto: ");
        String produto = scanner.nextLine().toLowerCase();

        switch (produto) {
            case "chocolate":
            case "feijão":
            case "macarrão":
        System.out.println("Categoria: Alimento");
            break;
            case "sabão":
            case "detergente":
            case "desinfetante":
                System.out.println("Categoria: Limpeza");
            break;
            case "celular":
            case "notebook":
            case "carregador":
                System.out.println("Categoria: Eletrônicos");
            break;
            default:
                System.out.println("Categoria: Produto desconhecido");
 }

        scanner.close();
 }
}
