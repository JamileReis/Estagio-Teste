package Estagio.StringsRegex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Atividade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o CPF: ");
        String cpf = scanner.nextLine();

        // Regex para validar o formato: XXX.XXX.XXX-XX
        boolean cpfValido = Pattern.matches("\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}", cpf);

        if (cpfValido) {
            System.out.println("O CPF " + cpf + " está no formato válido.");
        } else {
            System.out.println("O CPF " + cpf + " está no formato inválido.");
        }

        scanner.close();
    }
}
