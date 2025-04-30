# AtvPessoa


# PessoaCsvAdapter - Design Pattern Adapter

## Descrição
Este projeto aplica o padrão de projeto Adapter para integrar arquivos `.csv` ao sistema que trabalha com objetos `Pessoa`.

## Classes Criadas
- `Pessoa`: modelo com nome, idade e e-mail;
- `RepositorioDePessoas`: interface padrão do sistema;
- `PessoaCsvAdapter`: lê os dados de um arquivo `.csv` e retorna `List<Pessoa>`;
- `Main`: classe de teste e execução.

## Como executar
Compile todos os arquivos e execute `Main.java`. Certifique-se de que o `pessoas.csv` está no mesmo diretório.
