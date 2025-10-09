package Estagio.StringsRegex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Atividade7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o código de referência: ");
        String codigo = scanner.nextLine();

        // Regex para validar o formato: 3 letras maiúsculas + hífen + 4 dígitos
        boolean codigoValido = Pattern.matches("[A-Z]{3}-\\d{4}", codigo);

        if (codigoValido) {
            System.out.println("O código de referência está válido.");
        } else {
            System.out.println("O código de referência está inválido.");
        }

        scanner.close();
    }
}
