package Estagio.StringsRegex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Atividade8 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite o CPF: ");
            String cpf = scanner.nextLine();

            // Primeiro valida o formato
            if (!Pattern.matches("\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}", cpf)) {
                System.out.println("O CPF " + cpf + " está no formato inválido.");
                return;
            }

            // Remove a formatação para validar dígitos
            String cpfNumeros = cpf.replaceAll("[^0-9]", "");

            // Aqui poderia adicionar a validação dos dígitos verificadores
            System.out.println("O CPF " + cpf + " está no formato válido.");
            System.out.println("Números do CPF: " + cpfNumeros);

            scanner.close();
        }
    }

