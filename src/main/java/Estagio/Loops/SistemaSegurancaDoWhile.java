package Estagio.Loops;

import java.util.Scanner;

public class SistemaSegurancaDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final String SENHA_CORRETA = "1234";
        final int MAX_TENTATIVAS = 3;
        int tentativas = 0;
        boolean acessoConcedido = false;

        System.out.println("=== SISTEMA BANCÁRIO (DO-WHILE) ===");

        do {
            System.out.print("Digite sua senha: ");
            String senhaDigitada = scanner.nextLine();

            if (senhaDigitada.equals(SENHA_CORRETA)) {
                acessoConcedido = true;
                System.out.println("Senha Correta! Acesso concedido!");
            } else {
                tentativas++;
                int tentativasRestantes = MAX_TENTATIVAS - tentativas;
                if (tentativasRestantes > 0) {
                    System.out.println("Senha incorreta! Tentativas restantes: " + tentativasRestantes);
                } else {
                    System.out.println("Senha incorreta!");
                }
            }
        } while (tentativas < MAX_TENTATIVAS && !acessoConcedido);

        if (!acessoConcedido) {
            System.out.println("Conta bloqueada! Número máximo de tentativas excedido.");
            System.out.println("Entre em contato com o suporte para desbloquear sua conta.");
        }

        scanner.close();
    }
}
