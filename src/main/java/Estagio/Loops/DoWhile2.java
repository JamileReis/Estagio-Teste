package Estagio.Loops;

import java.util.Scanner;

public class DoWhile2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n = sc.nextInt();

        int fatorial = 1;
        int i = n;

        if (n == 0) {
            fatorial = 1;
        } else {
            do {
                fatorial *= i;
                i--;
            } while (i > 0);
        }

        System.out.println("Fatorial de " + n + " é: " + fatorial);
        sc.close();
    }
}
