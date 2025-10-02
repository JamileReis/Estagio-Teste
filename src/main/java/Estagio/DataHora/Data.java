package Estagio.DataHora;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Data {
    public static void main(String[] args){
        // Cria uma data atual (sem hora, apenas data)
        LocalDate dataCompra = LocalDate.now();

        // Cria uma data específica: 02 de Outubro de 2025
        LocalDate dataPrimeiraParcela = LocalDate.of(2025, 10, 02);

        // Adiciona 30 dias à data da primeira parcela para criar a segunda parcela
        LocalDate dataSegundaParcela = dataPrimeiraParcela.plusDays(30);

        // Verifica se a data da primeira parcela é igual à data atual
        if (dataPrimeiraParcela.isEqual(LocalDate.now())){
            System.out.println("Vencimento da primeira parcela!");
        } else {
            System.out.println("Ainda não está na data de vencimento!");
        }

        // Exibe as datas sem formatação específica
        System.out.println("Data compra: " + dataCompra);
        System.out.println("Data primeira parcela: " + dataPrimeiraParcela);
        System.out.println("Data segunda parcela: " + dataSegundaParcela);

        // Cria um formatador de data no padrão brasileiro (dia/mês/ano)
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        // Aplica o formato à data da compra
        System.out.println("Data compra formatada: " + dataCompra.format(formato));

        // Cria um objeto com data, hora e fuso horário atuais
        ZonedDateTime dataConclusaoCompra = ZonedDateTime.now();
        System.out.println("Data conclusão compra formatada: " + dataConclusaoCompra);

        // Converte a data/hora para o fuso horário de Nova York
        ZonedDateTime dataCompraNy = dataConclusaoCompra.withZoneSameInstant(
                ZoneId.of("America/New_York"));
        System.out.println("Data conclusão compra NY: "+dataCompraNy);

        // Cria horários específicos para início e fim do expediente
        LocalTime inicio = LocalTime.of(9,0);  // 09:00 horas
        LocalTime fim = LocalTime.of(17,30);   // 17:30 horas

        // Calcula a duração entre dois horários
        Duration duracao = Duration.between(inicio, fim);

        // Exibe a duração convertendo para horas e minutos separadamente
        System.out.println("Duração do expediente: " + duracao.toHours() +
                " horas e " + duracao.toMinutesPart() + " minutos.");

        // Converte uma string no formato ISO (YYYY-MM-DD) para LocalDate
        LocalDate dataPagamento = LocalDate.parse("2025-10-30");

        // Calcula o período (diferença) entre duas datas
        Period periodo = Period.between(dataCompra, dataPagamento);

        // OBSERVAÇÃO: Period.getDays() retorna apenas os dias excedentes,
        // não o total de dias. Para dias totais, usar ChronoUnit.DAYS.between()
        System.out.println("Diferença em dias: " + periodo.getDays());

    }
}
