package model;

public class Contato {
    private String nome;
    private int telefone;
    private int idade;
    private String endereco;

    public Contato(String nome, int telefone, int idade, String endereco) {
        this.nome = nome;
        this.telefone = telefone;
        this.idade = idade;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void informationsContact() {
        System.out.println("Nome: " + nome + " Telefone: " + telefone + " Idade: " + idade + " Endereço: " + endereco);
    }

}
