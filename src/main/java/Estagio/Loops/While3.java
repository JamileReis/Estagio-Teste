package Estagio.Loops;

import java.util.Scanner;

public class While3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n = sc.nextInt();

        int fatorial = 1;
        int i = n;
        while (i > 0) {
            fatorial *= i;
            i--;
        }

        System.out.println("Fatorial de " + n + " é: " + fatorial);
        sc.close();
    }
}
