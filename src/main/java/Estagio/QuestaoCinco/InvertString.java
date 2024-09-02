package Estagio.QuestaoCinco;

import java.util.Scanner;

public class InvertString {
    public static void main(String[] args) {
        // Criar um objeto Scanner para leitura da entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário para inserir a string
        System.out.print("Digite a string a ser invertida: ");
        String input = scanner.nextLine();

        // Fechar o scanner
        scanner.close();

        // Inverter a string
        String reversed = inverterString(input);

        // Exibir a string invertida
        System.out.println("String invertida: " + reversed);
    }

    // Método para inverter a string
    public static String inverterString(String str) {
        // Converter a string em um array de caracteres
        char[] caracteres = str.toCharArray();
        int esquerda = 0;
        int direita = caracteres.length - 1;

        // Trocar os caracteres na posição esquerda e direita
        while (esquerda < direita) {
            char temp = caracteres[esquerda];
            caracteres[esquerda] = caracteres[direita];
            caracteres[direita] = temp;

            esquerda++;
            direita--;
        }

        // Converter o array de caracteres de volta para uma string
        return new String(caracteres);
    }
}
