package OperacoesTerminais;

import OperacoesIntermediarias.Pessoa;

import java.util.List;

public class AllMatch {
    public static void main(String[] args) {
        System.out.println("Exemplo AllMatch");
        List<Pessoa> lista = new Pessoa().popularPessoas();
        boolean result = lista.stream()
                .allMatch(pessoa -> pessoa.getNacionalidade().equals("Mexico"));
        System.out.println(result);
    }
}
