package Estagio.StringsRegex;

import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do arquivo: ");
        String nomeArquivo = scanner.nextLine();

        // Encontrando a última posição do ponto (para casos com múltiplos pontos)
        int ultimaPosicaoPonto = nomeArquivo.lastIndexOf(".");

        if (ultimaPosicaoPonto == -1) {
            // Se não encontrar ponto, o arquivo não tem extensão
            System.out.println("Nome do arquivo sem extensão: " + nomeArquivo);
        } else {
            // Extrai o nome sem a extensão (do início até o último ponto)
            String nomeSemExtensao = nomeArquivo.substring(0, ultimaPosicaoPonto);
            System.out.println("Nome do arquivo sem extensão: " + nomeSemExtensao);
        }

        scanner.close();
    }
}
