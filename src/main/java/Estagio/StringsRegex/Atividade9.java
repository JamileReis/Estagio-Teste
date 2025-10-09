package Estagio.StringsRegex;

import java.util.Scanner;

public class Atividade9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // SOLICITA E CAPTURA A ENTRADA DO USUÁRIO
        System.out.print("Digite a senha: ");
        String senha = scanner.nextLine();

        // CHAMA A ROTINA DE VALIDAÇÃO E OBTÉM O RESULTADO
        String resultado = validarSenhaComDetalhes(senha);

        // EXIBE O RESULTADO DA VALIDAÇÃO
        System.out.println(resultado);

        scanner.close();
    }

    /**
     * ROTINA PRINCIPAL DE VALIDAÇÃO DE SENHA
     * Realiza verificações completas nos requisitos de segurança
     *
     * @param senha - String contendo a senha a ser validada
     * @return String com mensagem de sucesso ou lista de erros detalhados
     */
    public static String validarSenhaComDetalhes(String senha) {
        // STRINGBUILDER PARA ACUMULAR MENSAGENS DE ERRO
        // (mais eficiente que concatenação múltipla de Strings)
        StringBuilder erros = new StringBuilder();

        // VERIFICAÇÃO 1: COMPRIMENTO MÍNIMO
        // Garante que a senha tenha pelo menos 8 caracteres
        if (senha.length() < 8) {
            erros.append("• Deve ter pelo menos 8 caracteres\n");
        }

        // DECLARAÇÃO DAS VARIÁVEIS DE CONTROLE
        // Cada boolean controla um requisito específico
        boolean temMaiuscula = false;    // Pelo menos 1 letra maiúscula
        boolean temMinuscula = false;    // Pelo menos 1 letra minúscula
        boolean temNumero = false;       // Pelo menos 1 dígito numérico
        boolean temEspecial = false;     // Pelo menos 1 caractere especial

        // STRING CONTENDO TODOS OS CARACTERES ESPECIAIS PERMITIDOS
        String especiais = "!@#$%^&*()_+-=[]{};':\"\\|,.<>/?";

        // ROTINA DE ANÁLISE CARACTER POR CARACTER
        // Percorre cada caractere da senha para verificar os requisitos
        for (char c : senha.toCharArray()) {
            // VERIFICA SE É LETRA MAIÚSCULA (A-Z)
            if (Character.isUpperCase(c)) temMaiuscula = true;

                // VERIFICA SE É LETRA MINÚSCULA (a-z)
            else if (Character.isLowerCase(c)) temMinuscula = true;

                // VERIFICA SE É DÍGITO NUMÉRICO (0-9)
            else if (Character.isDigit(c)) temNumero = true;

                // VERIFICA SE É CARACTERE ESPECIAL
                // Usa indexOf para buscar o caractere na lista de especiais
            else if (especiais.indexOf(c) >= 0) temEspecial = true;
        }

        // VERIFICAÇÕES PÓS-ANÁLISE
        // Adiciona mensagens de erro para cada requisito não atendido
        if (!temMaiuscula) erros.append("• Deve ter pelo menos uma letra maiúscula\n");
        if (!temMinuscula) erros.append("• Deve ter pelo menos uma letra minúscula\n");
        if (!temNumero) erros.append("• Deve ter pelo menos um número\n");
        if (!temEspecial) erros.append("• Deve ter pelo menos um caractere especial\n");

        // ROTINA DE RETORNO DO RESULTADO
        // Se não há erros (StringBuilder vazio), retorna mensagem de sucesso
        // Caso contrário, retorna a lista completa de erros
        if (erros.length() == 0) {
            return "A senha é válida.";
        } else {
            return "A senha é inválida. Erros:\n" + erros.toString();
        }
    }
}