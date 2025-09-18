package Estagio.Loops;

import java.util.Scanner;

public class SistemaSegurancaFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final String SENHA_CORRETA = "1234";
        final int MAX_TENTATIVAS = 3;
        boolean acessoConcedido = false;

        System.out.println("=== SISTEMA BANCÁRIO (FOR) ===");

        for (int tentativas = 0; tentativas < MAX_TENTATIVAS && !acessoConcedido; tentativas++) {
            System.out.print("Digite sua senha: ");
            String senhaDigitada = scanner.nextLine();

            if (senhaDigitada.equals(SENHA_CORRETA)) {
                acessoConcedido = true;
                System.out.println("Senha Correta! Acesso concedido!");
            } else {
                int tentativasRestantes = MAX_TENTATIVAS - (tentativas + 1);
                if (tentativasRestantes > 0) {
                    System.out.println("Senha incorreta! Tentativas restantes: " + tentativasRestantes);
                }
            }
        }

        if (!acessoConcedido) {
            System.out.println("Conta bloqueada! Número máximo de tentativas excedido.");
            System.out.println("Entre em contato com o suporte para desbloquear sua conta.");
        }

        scanner.close();
    }
}
