package OperacoesIntermediarias;

import java.util.List;
import java.util.stream.Stream;

public class Limit {
    public static void main(String[] args) {
        System.out.println("Exemplo Limit");
        //Limita a quantidade de informação em sua nova coleção
        List<Pessoa> lista = new Pessoa().popularPessoas();

        Stream<Pessoa> stream = lista.stream().limit(2);
    }
}
