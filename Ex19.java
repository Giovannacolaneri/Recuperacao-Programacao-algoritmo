import java.util.Scanner;

public class Ex19{
    public static void main(String[] args) {
        System.out.println("Programa de cadastro de clientes");
        Scanner scanner = new Scanner(System.in);
        String[] clientes = new String[10];

        System.out.println("1 - Adicionar cliente");
        System.out.println("2 - Listar clientes");
        System.out.println("3 - Editar cliente");
        System.out.println("4 - Excluir cliente");
        System.out.print("Escolha uma opção: ");
        int opcao = scanner.nextInt();
        scanner.nextLine();

        switch (opcao) {
            case 1:
                boolean adicionou = false;
                for (int i = 0; i < clientes.length; i++) {
                    if (clientes[i] == null) {
                        System.out.print("Digite o nome do cliente: ");
                        clientes[i] = scanner.nextLine();
                        System.out.println("Cliente adicionado na posição " + (i + 1));
                        adicionou = true;
                        break;
                    }
                }
                if (!adicionou) {
                    System.out.println("Lista cheia. Não é possível adicionar mais clientes.");
                }
                break;
            case 2:
                System.out.println("Lista de clientes:");
                boolean vazio = true;
                for (int i = 0; i < clientes.length; i++) {
                    if (clientes[i] != null) {
                        System.out.println((i + 1) + " - " + clientes[i]);
                        vazio = false;
                    }
                }
                if (vazio) {
                    System.out.println("Nenhum cliente cadastrado.");
                }
                break;
            case 3:
            
                System.out.print("Digite o número do cliente que deseja editar: ");
                int posEditar = scanner.nextInt() - 1;
                scanner.nextLine(); 
                if (posEditar >= 0 && posEditar < clientes.length && clientes[posEditar] != null) {
                    System.out.print("Novo nome: ");
                    clientes[posEditar] = scanner.nextLine();
                    System.out.println("Cliente atualizado.");
                } else {
                    System.out.println("Cliente não encontrado.");
                }
                break;

            case 4:
                            System.out.print("Digite o número do cliente que deseja excluir: ");
                int posExcluir = scanner.nextInt() - 1;
                if (posExcluir >= 0 && posExcluir < clientes.length && clientes[posExcluir] != null) {
                    clientes[posExcluir] = null;
                    System.out.println("Cliente excluído.");
                } else {
                    System.out.println("Cliente não encontrado.");
                }
                break;

            default:
                System.out.println("Opção inválida.");
        }

        scanner.close();
    }
}
