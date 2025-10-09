package Estagio.StringsRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EstudoRegex {
    public static void main(String[] args) {
        // Texto que será analisado para encontrar o email
        String texto = "Meu email é jacqueline@gmail.com";

        // Compila o padrão regex para buscar emails
        // \\w+@\\w+.\\w+ significa:
        // \\w+  - um ou mais caracteres alfanuméricos (parte antes do @)
        // @     - símbolo @ literal
        // \\w+  - um ou mais caracteres alfanuméricos (domínio)
        // .     - ponto literal (devido ao escape, mas aqui está errado - deveria ser \\.)
        // \\w+  - um ou mais caracteres alfanuméricos (extensão do domínio)
        Pattern pattern = Pattern.compile("\\w+@\\w+.\\w+");

        // Cria um Matcher para aplicar o padrão ao texto
        Matcher matcher = pattern.matcher(texto);

        // Verifica se o padrão foi encontrado no texto
        if (matcher.find()) {
            // Imprime o email encontrado
            System.out.println(matcher.group());
        }

        // Chama o método para formatar telefone e imprime o resultado
        System.out.println(formatarTelefone("2199887744"));
    }

    /**
     * Método para formatar um número de telefone no padrão brasileiro
     * @param telefone - número de telefone sem formatação (ex: "2199887744")
     * @return telefone formatado (ex: "(21) 99887-744") ou mensagem de erro
     */
    public static String formatarTelefone(String telefone) {
        // Regex para capturar grupos do telefone:
        // (\\d{2}) - grupo 1: 2 dígitos (DDD)
        // (\\d{4,5}) - grupo 2: 4 ou 5 dígitos (parte principal - 4 para fixo, 5 para celular)
        // (\\d{4}) - grupo 3: 4 dígitos (sufixo)
        String regex = "(\\d{2})(\\d{4,5})(\\d{4})";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(telefone);

        // Verifica se o telefone corresponde exatamente ao padrão
        if (matcher.matches()) {
            // Formata o telefone usando os grupos capturados
            return String.format("(%s) %s-%s",
                    matcher.group(1),  // DDD
                    matcher.group(2),  // Parte do meio
                    matcher.group(3)   // Final
            );
        }

        return "Número de telefone inválido!";
    }
}