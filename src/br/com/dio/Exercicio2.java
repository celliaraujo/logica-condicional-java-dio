package br.com.dio;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        int mediaDependentes = 3;
        double  mediaSalario = 600;

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite a quantidade de dependentes: ");

        int quantidadeDependentes = scanner.nextInt();

        System.out.println("Digite seu salário mensal: ");

        double salarioMensal = scanner.nextDouble();

        boolean muitosDependentes = quantidadeDependentes >= mediaDependentes;
        boolean salarioBaixo = (salarioMensal / quantidadeDependentes) <= mediaSalario;

        boolean recebeAuxilio = muitosDependentes && salarioBaixo;

        System.out.println("Muitos dependentes ? " + muitosDependentes);
        System.out.println("Salário Baixo ? " + salarioBaixo);
        System.out.println("Recebe Auxilio ? " + recebeAuxilio);

    }
}
