package controller;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import model.Contato;

public class ContatoController {
    Scanner scanner = new Scanner(System.in);
    private List<Contato> contatos;

    public ContatoController() {
        contatos = new ArrayList<>();
    }

    public void create(Contato contato) {
        contatos.add(contato);
    }

    public void read(int telefone) {
        boolean exist = false;
        for (Contato contatoAux : contatos) {
            if (contatoAux.getTelefone() == telefone) {
                contatoAux.informationsContact();
                exist = true;
            }
        }
        if (exist == false) {
            System.out.println("Contato inexistente");
        }
    }

    public void update(int telefone) {
        boolean exist = false;
        for (Contato contatoAux : contatos) {
            if (contatoAux.getTelefone() == telefone) {
                System.out.println("Novo telefone: ");
                int telefoneAux = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Nome atualizado: ");
                String nomeAux = scanner.nextLine();
                System.out.println("Idade atualizada: ");
                int idadeAux = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Novo endereço: ");
                String enderecoAux = scanner.nextLine();

                contatoAux.setTelefone(telefoneAux);
                contatoAux.setNome(nomeAux);
                contatoAux.setIdade(idadeAux);
                contatoAux.setEndereco(enderecoAux);
                exist = true;
            }
        }
        if (exist == false) {
            System.out.println("Contato inexistente");
        }
    }

    public void delete(int telefone) {
        contatos.removeIf(contato -> contato.getTelefone() == telefone);
    }
}
