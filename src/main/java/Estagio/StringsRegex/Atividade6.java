package Estagio.StringsRegex;

import java.util.Scanner;

public class Atividade6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Recebendo os dados do usuário
        System.out.print("Digite o texto: ");
        String texto = scanner.nextLine();

        System.out.print("Digite a palavra: ");
        String palavra = scanner.nextLine();

        // Verificando se a palavra está presente no texto
        if (texto.contains(palavra)) {
            System.out.println("A palavra \"" + palavra + "\" está presente no texto.");
        } else {
            System.out.println("A palavra \"" + palavra + "\" não está presente no texto.");
        }

        scanner.close();
    }
}
