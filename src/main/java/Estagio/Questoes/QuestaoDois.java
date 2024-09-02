package Estagio.Questoes;

import java.util.Scanner;

public class QuestaoDois {
    // Método que verifica se um número pertence à sequência de Fibonacci
    public static boolean isFibonacci(int n) {
        if (n < 0) {
            return false;
        }
        int a = 0;
        int b = 1;

        while (a <= n) {
            if (a == n) {
                return true;
            }
            int next = a + b;
            a = b;
            b = next;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o número ao usuário
        System.out.print("Digite um número para verificar se ele pertence à sequência de Fibonacci: ");
        try {
            int num = scanner.nextInt();

            if (isFibonacci(num)) {
                System.out.println("O número " + num + " pertence à sequência de Fibonacci.");
            } else {
                System.out.println("O número " + num + " NÃO pertence à sequência de Fibonacci.");
            }
        } catch (Exception e) {
            System.out.println("Por favor, digite um número inteiro válido:");
        } finally {
            scanner.close();
        }
    }
}

