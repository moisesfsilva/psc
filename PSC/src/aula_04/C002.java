package aula_04;

import java.util.Scanner;

/*
C002 Leia um numero inteiro e informar se é impar ou par!!
*/
public class C002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;


        System.out.print("Digite um número: ");
        numero = scanner.nextInt();

        if (numero % 2 == 0){
            System.out.println("O numero "+numero+" é par!");
        }else {
            System.out.println("O numero "+numero+" é impar!");

        }
    }
}
