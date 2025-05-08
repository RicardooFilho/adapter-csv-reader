import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PessoaCsvAdapter implements RepositorioDePessoas {

    private static final int MAX_ROW_ATTRIBUTES = 3;

    public PessoaCsvAdapter() {
    }

    @Override
    public List<Pessoa> listarPessoas(String csvFilePath) {

        List<Pessoa> pessoas = new ArrayList<>();

        try  {

            BufferedReader reader = new BufferedReader(new FileReader(csvFilePath));

            String linha;
            boolean isCabecalho = true;

            while (Objects.nonNull(linha = reader.readLine())) {
                if (isCabecalho) {

                    isCabecalho = false;
                    continue;
                }

                String[] partes = getRowSplit(linha);

                if (Objects.equals(partes.length, MAX_ROW_ATTRIBUTES)) {

                    buildNewPessoa(partes, pessoas);
                }
            }

        } catch (IOException e) {
            throw new RuntimeException("Erro ao ler o arquivo CSV", e);
        }

        return pessoas;
    }

    private String[] getRowSplit(String linha) {

        return linha.split(",");
    }

    private void buildNewPessoa(String[] partes, List<Pessoa> pessoas) {
        String nome = partes[0].trim();
        int idade = Integer.parseInt(partes[1].trim());
        String email = partes[2].trim();

        pessoas.add(new Pessoa(nome, idade, email));
    }
}
