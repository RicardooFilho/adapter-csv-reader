public class Pessoa {

    private String nome;

    private int idade;

    private String email;

    public Pessoa(String nome, int idade, String email) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
    }

    @Override
    public String toString() {
        return String.format("Pessoa { Nome: %s, Idade: %s, E-mail: %s }", nome, idade, email);
    }
}
