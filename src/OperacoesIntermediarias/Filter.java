package OperacoesIntermediarias;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Filter {
    public static void main(String[] args) {
        System.out.println("Exemplos Filter");
        //Usada para filtrar as propriedades desejadas
        List<Pessoa> lista = new Pessoa().popularPessoas();
        Stream<Pessoa> stream = lista.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"));
    }
}
