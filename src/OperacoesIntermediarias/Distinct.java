package OperacoesIntermediarias;

import java.util.List;
import java.util.stream.Stream;

public class Distinct {
    public static void main(String[] args) {
        System.out.println("Exemplo Distinct");
        //Usado para não repetir em sua nova coleção, levando o equal e hashcode na classe
        List<Pessoa> lista = new Pessoa().popularPessoas();

        Stream<Pessoa> stream = lista.stream().distinct();
    }
}
