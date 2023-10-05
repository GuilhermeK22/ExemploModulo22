package OperacoesIntermediarias;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Sorted {
    public static void main(String[] args) {
        System.out.println("Exemplo Sorted");
        //Usado para fazer a ordenação dos elementos
        List<Pessoa> lista = new Pessoa().popularPessoas();

        Stream<Pessoa> stream = lista.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"))
                .sorted(Comparator.comparing(Pessoa::getNome));

        Stream<Pessoa> stream1 = lista.stream()
                .sorted(Comparator.comparing(Pessoa::getNome));

        Stream<Pessoa> stream2 = lista.stream()
                .sorted((p1,p2) -> Integer.compare(p2.getIdade(), p1.getIdade()));
    }
}
