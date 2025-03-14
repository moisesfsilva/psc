package aula_02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nomeCompleto;
        String formacao;
        int idade;
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nome: ");
        nomeCompleto = scanner.nextLine();
        System.out.printf("Qual sua formção:");
        formacao = scanner.nextLine();
        System.out.printf("Idade: ");
        idade = scanner.nextInt();
        System.out.printf("O %s tem %d anos de idade e é formado em %s.\n",
                nomeCompleto, idade, formacao);
    }
}