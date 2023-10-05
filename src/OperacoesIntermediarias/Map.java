package OperacoesIntermediarias;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Map {
    public static void main(String[] args) {
        System.out.println("Exemplos Map");
        //Transformar a lista de um objeto para outro
        List<Pessoa> lista = new Pessoa().popularPessoas();

        Stream<Integer> stream = lista.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"))
                .map(Pessoa::getIdade);

        IntStream stream1 = lista.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"))
                .mapToInt(Pessoa::getIdade);

    }
}
