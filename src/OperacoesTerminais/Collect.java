package OperacoesTerminais;

import OperacoesIntermediarias.Pessoa;

import java.util.*;
import java.util.stream.Collectors;

public class Collect {
    public static void main(String[] args) {
        System.out.println("\nExemplo Collect");
        List<Pessoa> lista = new Pessoa().popularPessoas();

        lista.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"))
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("\nUtilizando Set");

        Set<Pessoa> set = lista.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"))
                .collect(Collectors.toSet());
        set.forEach(System.out::println);

        System.out.println("\nUtilizando ArrayList");

        ArrayList<Pessoa> arrayList = lista.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"))
                .collect(Collectors.toCollection(ArrayList::new));
        arrayList.forEach(System.out::println);

        System.out.println("\nUtilizando Map");

        Map<Integer, Pessoa> map = lista.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Mexico"))
                .collect(Collectors.toMap(Pessoa::getIdade, Pessoa::new));

        map.forEach((k,v) -> System.out.println(k + " / " + v));

        System.out.println("\n");

        Map<Integer, List<Pessoa>> agrupaPorIdade = lista.stream()
                //.filter(pessoa -> pessoa.getNacionalidade().equals("Mexico"))
                .collect(Collectors.groupingBy(Pessoa::getIdade));

        agrupaPorIdade.forEach((k,v) -> System.out.println(k + " / " + v));
    }
}
