package exercicios;

import utils.LerEntrada;
import utils.Pessoa;
import utils.PessoaUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercicios {

    // 1 - Crie um programa que receba dois n�meros inteiros e exiba qual deles � o menor;
    public static void runExercicio1() {
        System.out.println("Digite o primeiro valor: ");
        int valor1 = LerEntrada.lerInt();
        System.out.println("Digite o segundo valor: ");
        int valor2 = LerEntrada.lerInt();

        System.out.print("Menor valor: " + ((valor1 < valor2) ? valor1 : valor2));
    }

    //  2- Crie um programa que receba cinco números inteiros e exiba qual deles é o maior;
    public static void runExercicio2() {
        List valores = new ArrayList<>();
        for (int i = 0; i <= 4; i++) {
            System.out.println("Digite o " + (i + 1) + "º valor: ");
            valores.add(LerEntrada.lerInt());
        }
        System.out.print("Maior valor: " + Collections.max(valores));
    }

    //  3 - Crie um programa que receba 2 palavras como parâmetro e indique qual é a mais comprida e qual é a mais curta (ou se ambas têm o mesmo tamanho)
    public static void runExercicio3() {
        System.out.println("Digite a primeira palavra: ");
        String primeiraPalavra = LerEntrada.lerString();

        System.out.println("Digite a segunda palavra: ");
        String segundaPalavra = LerEntrada.lerString();

        if (primeiraPalavra.length() > segundaPalavra.length()) {
            System.out.println("PRIMEIRA PALAVRA É MAIOR");
        } else if (primeiraPalavra.length() == segundaPalavra.length()) {
            System.out.println("AS PALAVRAS SÃO IGUAIS");
        } else {
            System.out.println("SEGUNDA PALAVRA É MAIOR");
        }
    }

    // 4 - Crie um programa que exiba o número de consoantes e o número de vogais de uma palavra recebida como parâmetro;
    public static void runExercicio4() {
        String VOGAIS = "A|E|I|O|U";

        System.out.println("Digite uma frase: ");
        String frase = LerEntrada.lerString().toUpperCase();

        int countVogais = 0, countConsoantes = 0;

        for (int i = 0; i < frase.length(); i++) {
            String cAtual = String.valueOf(frase.charAt(i));
            if (cAtual.matches(VOGAIS))
                countVogais++;
            else
                countConsoantes++;
        }

        System.out.println("QUANTIDADE CONSOANTES: " + countConsoantes);
        System.out.println("QUANTIDADE VOGAIS    : " + countVogais);
    }


    // 5 - Crie um programa que receba uma palavra e informe se a mesma é um palíndromo;
    public static void runExercicio5() {
        System.out.println("Digite uma palavra: ");
        String palavra = LerEntrada.lerString();

        String palavraInvertida = "";
        for (int i = palavra.length() - 1; i >= 0; i--) {
            palavraInvertida += palavra.charAt(i);
        }

        System.out.println(palavraInvertida);

        if (palavra.equals(palavraInvertida)) {
            System.out.println("PALAVRA É UM PALINDROMO");
        } else {
            System.out.println("NÃO É UM PALINDROMO");
        }
    }

    // 6 - Crie um programa que peça para o usuário o nome, a altura e o peso de duas pessoas e apresente o nome da mais pesada e o nome da mais alta;
    public static void runExercicio6() {
        List<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(PessoaUtils.lerDadosPessoa());
        pessoas.add(PessoaUtils.lerDadosPessoa());

        Pessoa pessoaMaisAlta = PessoaUtils.getPessoaMaisAlta(pessoas);
        Pessoa pessoaMaisPesada = PessoaUtils.getPessoaPesada(pessoas);

        System.out.println("Pessoa mais alta é  : " + pessoaMaisAlta.getNome());
        System.out.println("Pessoa mais pesada é: " + pessoaMaisPesada.getNome());
    }


    // 8 -  Crie um programa que peça para o usuário o nome, a altura e o peso de duas pessoas e apresente o nome da mais pesada e o nome da mais alta
    public static void runExercicio8() {
        System.out.println("Digite um valor: ");
        int valor = LerEntrada.lerInt();

        for (int i = 0; i <= valor; i++) {

        }

    }
}
