import java.util.Scanner;

import controller.ContatoController;
import model.Contato;

public class Agenda {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ContatoController contactController = new ContatoController();

        int opcao;

        while (true) {
            exibirMenu();
            opcao = scanner.nextInt();
            if (opcao == 1) {
                System.out.print("Telefone:");
                int telefoneAux = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Nome:");
                String nomeAux = scanner.nextLine();
                System.out.print("Idade:");
                int idadeAux = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Endereço:");
                String enderecoAux = scanner.next();
                Contato contatoAux = new Contato(nomeAux, telefoneAux, idadeAux, enderecoAux);
                contactController.create(contatoAux);
            } else if (opcao == 2) {
                System.out.println("Me informe o telefone do contato o qual deseja vizualizar as informações");
                int telefoneAux = scanner.nextInt();
                contactController.read(telefoneAux);
            } else if (opcao == 3) {
                System.out.println("Me informe o telefone do contato o qual deseja atualizar as informações");
                int telefoneAux = scanner.nextInt();
                contactController.update(telefoneAux);
            } else if (opcao == 4) {
                System.out.println("Me informe o telefone do contato o qual deseja deletar");
                int telefoneAux = scanner.nextInt();
                contactController.delete(telefoneAux);
            } else if (opcao == 0) {
                break;
            } else {
                System.out.println("Digite uma opção válida");
            }
            scanner.nextLine();
        }
    }

    private static void exibirMenu() {
        System.out.println("===== MENU =====");
        System.out.println("1. Adicionar Contato");
        System.out.println("2. Mostrar um Contato");
        System.out.println("3. Atualizar Contato");
        System.out.println("4. Remover Contato");
        System.out.println("0. Sair");
        System.out.println("Escolha uma opção: ");
    }
}
