import java.util.List;

public class Teste {
    public static void main(String[] args) {

        PessoaCsvAdapter adapter = new PessoaCsvAdapter();

        List<Pessoa> pessoas = adapter.listarPessoas("pessoas.csv");

        pessoas.forEach(System.out::println);

    }
}
