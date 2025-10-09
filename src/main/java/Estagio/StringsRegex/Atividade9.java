package Estagio.StringsRegex;

import java.util.Scanner;

public class Atividade9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a senha: ");
        String senha = scanner.nextLine();

        String resultado = validarSenhaComDetalhes(senha);
        System.out.println(resultado);

        scanner.close();
    }

    public static String validarSenhaComDetalhes(String senha) {
        StringBuilder erros = new StringBuilder();

        // Verifica comprimento
        if (senha.length() < 8) {
            erros.append("• Deve ter pelo menos 8 caracteres\n");
        }

        // Verifica cada requisito
        boolean temMaiuscula = false;
        boolean temMinuscula = false;
        boolean temNumero = false;
        boolean temEspecial = false;
        String especiais = "!@#$%^&*()_+-=[]{};':\"\\|,.<>/?";

        for (char c : senha.toCharArray()) {
            if (Character.isUpperCase(c)) temMaiuscula = true;
            else if (Character.isLowerCase(c)) temMinuscula = true;
            else if (Character.isDigit(c)) temNumero = true;
            else if (especiais.indexOf(c) >= 0) temEspecial = true;
        }

        if (!temMaiuscula) erros.append("• Deve ter pelo menos uma letra maiúscula\n");
        if (!temMinuscula) erros.append("• Deve ter pelo menos uma letra minúscula\n");
        if (!temNumero) erros.append("• Deve ter pelo menos um número\n");
        if (!temEspecial) erros.append("• Deve ter pelo menos um caractere especial\n");

        if (erros.length() == 0) {
            return "A senha é válida.";
        } else {
            return "A senha é inválida. Erros:\n" + erros.toString();
        }
    }
}
