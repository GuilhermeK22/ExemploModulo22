package OperacoesTerminais;

import OperacoesIntermediarias.Pessoa;

import java.util.List;

public class Count {
    public static void main(String[] args) {
        System.out.println("Exemplo Count");
        List<Pessoa> lista = new Pessoa().popularPessoas();
        long count = lista.stream().
                filter(pessoa -> pessoa.getNome().startsWith("M"))
                .count();
        System.out.println(count);

    }
}
