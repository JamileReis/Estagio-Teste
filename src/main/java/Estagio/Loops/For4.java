package Estagio.Loops;

import java.util.Scanner;

public class For4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite os números separados por espaço: ");
        String entrada = scanner.nextLine();

        // Divide a string em partes usando espaço como delimitador
        String[] partes = entrada.split(" ");
        int[] numeros = new int[partes.length];

        // Converte cada parte para inteiro
        for (int i = 0; i < partes.length; i++) {
            numeros[i] = Integer.parseInt(partes[i]);
        }

        // Encontra o maior número
        int maior = numeros[0]; // Começa assumindo que o primeiro é o maior

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }

        System.out.println("O maior número é: " + maior);

        scanner.close();
    }
}
