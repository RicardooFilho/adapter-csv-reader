# Adapter CSV Reader

## Classe Pessoa
Classe criada com o objetivo de mapear a Entidade Pessoa para termos um construtor e conseguirmos instanciar objetos desta classe com as informações que vem arquivo .csv.

## Classe PessoaCsvAdapter
Classe que irá implementar a interface 'RepositorioDePessoa' e sobreescrever o método 'listarPessoas()'. Ela atuará como um adaptador para arquivos CSV, para que seja possível usar este método a fim de retornar uma lista de Pessoas com as informações dadas no arquivo .csv.

## Arquivo pessoas.csv
Arquivo .csv que contém o nome, idade e email de cada pessoa.

## Interface RepositorioDePessoas
Interface que funciona como um contrato para as classes que forem implementá-la. Serve como **abstração** para que a aplicação possa funcionar com diferentes implementações sem depender de detalhes de como as pessoas são carregadas.

## Classe Teste
Classe criada com o objetivo de testar o adaptador para arquivos CSV.

## Design Pattern Utilizado: Adapter
Utilizado para permitir que a leitura do arquivo CSV seja adaptada à interface 'RepositorioDePessoas'.
