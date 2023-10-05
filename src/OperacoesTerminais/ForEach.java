package OperacoesTerminais;

import OperacoesIntermediarias.Pessoa;

import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        System.out.println("Exemplo ForEach");
        List<Pessoa> lista = new Pessoa().popularPessoas();
        lista.stream().forEach(pessoa -> System.out.println(pessoa.getNome()));

        System.out.println("** Usando Filter **");
        lista.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"))
                .forEach(p -> System.out.println(p.getNome()));

        System.out.println("** Usando Map **");
        lista.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"))
                .map(Pessoa::getIdade)
                .forEach(p -> System.out.println(p));
    }
}
