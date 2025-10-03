package Estagio.DataHora;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Atividade4 {
    public static void main(String[] args) {
        // LocalDate.of() cria uma data específica (ano, mês, dia)
        // Parâmetros: (ano, mês, dia)
        // Exemplo: 20 de março de 2025
        LocalDate dataVencimentoOriginal = LocalDate.of(2025, 3, 20);
        // ↑ 2025 = ano, 3 = março (meses começam em 1: janeiro=1, dezembro=12)
        // ↑ 20 = dia do mês
        // Número de meses a serem adicionados à data original
        int mesesAdicionados = 1;

        // plusMonths() adiciona a quantidade especificada de meses à data
        // Este método trata automaticamente casos especiais como:
        // - Fim do ano (dezembro → janeiro do próximo ano)
        // - Meses com quantidades diferentes de dias
        // - Anos bissextos
        LocalDate novaDataVencimento = dataVencimentoOriginal.plusMonths(mesesAdicionados);
        // ↑ Para 20/03/2025 + 1 mês = 20/04/2025
        // DateTimeFormatter.ofPattern() cria um formatador personalizado
        // "dd" = dia com dois dígitos (01-31)
        // "MM" = mês com dois dígitos (01-12)
        // "yyyy" = ano com quatro dígitos
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        // format() aplica o formato à data, convertendo para String
        String novaDataFormatada = novaDataVencimento.format(formatador);
        // ↑ Converte LocalDate para String no formato "20-04-2025"

        System.out.println("Nova data de vencimento: " + novaDataFormatada);
    }
}
