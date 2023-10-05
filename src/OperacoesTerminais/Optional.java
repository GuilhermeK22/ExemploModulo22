package OperacoesTerminais;

import OperacoesIntermediarias.Pessoa;

import java.util.Comparator;
import java.util.List;

public class Optional {
    public static void main(String[] args) {
        List<Pessoa> lista = new Pessoa().popularPessoas();
        java.util.Optional<Pessoa> opcional = lista.stream()
                .min(Comparator.comparing(Pessoa::getIdade));

        opcional.ifPresent(System.out::println);

    }
}
