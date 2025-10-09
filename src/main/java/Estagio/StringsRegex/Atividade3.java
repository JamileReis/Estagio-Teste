package Estagio.StringsRegex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Atividade3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o texto: ");
        String texto = scanner.nextLine();

        System.out.print("Digite a palavra a ser substituída: ");
        String palavraAntiga = scanner.nextLine();

        System.out.print("Digite a nova palavra: ");
        String palavraNova = scanner.nextLine();

        // Usando regex para substituição mais precisa (considera palavras completas)
        // \\b é o boundary - garante que é uma palavra completa, não parte de outra
        Pattern pattern = Pattern.compile("\\b" + Pattern.quote(palavraAntiga) + "\\b");
        java.util.regex.Matcher matcher = pattern.matcher(texto);

        if (!matcher.find()) {
            System.out.println("A palavra '" + palavraAntiga + "' não foi encontrada no texto.");
        } else {
            // Refaz a substituição para todo o texto
            String textoModificado = pattern.matcher(texto).replaceAll(palavraNova);
            System.out.println("Texto modificado: " + textoModificado);
        }

        scanner.close();
    }
}
