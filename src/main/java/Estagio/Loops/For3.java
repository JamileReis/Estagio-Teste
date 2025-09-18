package Estagio.Loops;

import java.util.Scanner;

public class For3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n = sc.nextInt();

        int fatorial = 1;
        for (int i = n; i > 0; i--) {
            fatorial *= i;
        }

        System.out.println("Fatorial de " + n + " é: " + fatorial);
        sc.close();
    }
}
