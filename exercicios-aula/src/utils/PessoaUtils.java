package utils;

import java.util.Comparator;
import java.util.List;

public class PessoaUtils {

    public static Pessoa lerDadosPessoa(){
        Pessoa pessoa = new Pessoa();

        System.out.println("Digite o nome da pessoa: ");
        pessoa.setNome(LerEntrada.lerString());

        System.out.println("Digite a altura de " + pessoa.getNome() + ": ");
        pessoa.setAltura(Double.parseDouble(LerEntrada.lerString()));


        System.out.println("Digite o peso de " + pessoa.getNome() + ": ");
        pessoa.setPeso(Double.parseDouble(LerEntrada.lerString()));

        return pessoa;
    }

    public static Pessoa getPessoaMaisAlta(List<Pessoa> pessoas){
        return pessoas.stream().max(Comparator.comparing(Pessoa::getAltura)).orElse(new Pessoa());
    }

    public static Pessoa getPessoaPesada(List<Pessoa> pessoas){
        return pessoas.stream().max(Comparator.comparing(Pessoa::getPeso)).orElse(new Pessoa());
    }
}
