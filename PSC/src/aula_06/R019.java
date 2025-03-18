package aula_06;

import java.util.Scanner;

public class R019 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Numero: ");
        int numero = scanner.nextInt();
        int i;
        int resultado;
        for (i = 1; i <= 10; i++){
            resultado = numero * i;
            System.out.printf(numero+"X"+i + "=" + resultado + "\n");
        }
    }
}
