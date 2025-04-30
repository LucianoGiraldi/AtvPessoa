package org.example;

public class Main {
    public static void main(String[] args) {
        RepositorioDePessoas repositorio = new PessoaCsvAdapter("pessoas.csv");
        for (Pessoa p : repositorio.listarPessoas()) {
            System.out.println(p);
        }
    }
}
