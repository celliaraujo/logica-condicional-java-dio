package br.com.dio;

public class Exercicio1 {
    public static void main(String[] args) {

        int numeroInteiro1 = 10;
        int numeroInteiro2 = 20;
        float numeroFlutuante1 = 4.5f;
        float numeroFlutuante2 = 3.5f;
        char caracter1 = 'x';
        char caracter2 = 'y';
        String nome1 = "Fulano";
        String nome2 = "Fulano";
        boolean verdadeiro1 = true;
        boolean verdadeiro2 = false;
        boolean resultadoComparacao = false;

        //Impressão de resultado e comparação em única linha de codigo

        System.out.println("numeroInteiro1 é igual a numeroInteiro2 ? " + (numeroInteiro1==numeroInteiro2));


        //Comparação entre inteiros

        resultadoComparacao = numeroInteiro1 == numeroInteiro2;

        System.out.println("numeroInteiro1 é igual ao numeroInteiro2? " + resultadoComparacao);

        resultadoComparacao = numeroInteiro1 != numeroInteiro2;

        System.out.println("numeroInteiro1 é diferente de numeroInteiro2? " + resultadoComparacao);

        resultadoComparacao = numeroInteiro1 > numeroInteiro2;

        System.out.println("numeroInteiro1 é maior que numeroInteiro2? " + resultadoComparacao);

        resultadoComparacao = numeroInteiro1 <= numeroInteiro2;

        System.out.println("numeroInteiro1 é menor ou igual numeroInteiro2? " + resultadoComparacao);

        //Comparação entre flutuantes

        resultadoComparacao = numeroFlutuante1 == numeroFlutuante2;

        System.out.println("numeroFlutuante1 é igual numeroFlutuante2? " + resultadoComparacao);

        resultadoComparacao = numeroFlutuante1 != numeroFlutuante2;

        System.out.println("numeroFlutuante1 é diferente de numeroFlutuante2? " + resultadoComparacao);

        resultadoComparacao = numeroFlutuante1 >= numeroFlutuante2;

        System.out.println("numeroFlutuante1 é maior ou igual numeroFlutuante2? " + resultadoComparacao);

        resultadoComparacao = numeroFlutuante1 < numeroFlutuante2;

        System.out.println("numeroFlutuante1 é menor numeroFlutuante2? " + resultadoComparacao);

        //Comparação entre caracteres

        resultadoComparacao = caracter1 == caracter2;

        System.out.println("caracter1 é igual caracter2? " + resultadoComparacao);

        resultadoComparacao = caracter1 != caracter2;

        System.out.println("caracter1 é diferente de caracter2? " + resultadoComparacao);

        resultadoComparacao = caracter1 > caracter2;

        System.out.println("caracter1 é maior que caracter2? " + resultadoComparacao);

        resultadoComparacao = caracter1 <= caracter2;

        System.out.println("caracter1 é menor ou igual caracter2? " + resultadoComparacao);

        //Comparação entre Strings

        resultadoComparacao = nome1 == nome2;

        System.out.println("nome1 é igual nome2? " + resultadoComparacao);

        resultadoComparacao = nome1 != nome2;

        System.out.println("nome1 é diferente de nome2? " + resultadoComparacao);





    }
}