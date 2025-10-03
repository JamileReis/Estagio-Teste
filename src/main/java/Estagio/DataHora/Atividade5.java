package Estagio.DataHora;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Atividade5 {
    public static void main(String[] args) {

        // LocalDate.of() cria uma data específica para o evento
        // Parâmetros: (ano, mês, dia)
        // Exemplo: 10 de março de 2025
        LocalDate dataEvento = LocalDate.of(2025, 3, 10);
        // ↑ 2025 = ano, 3 = março, 10 = dia

        // LocalDate.now() retorna a data atual do sistema
        // Exemplo: 15 de março de 2025
        LocalDate dataAtual = LocalDate.now();
        // ↑ Captura automaticamente a data do computador

        // DateTimeFormatter cria um formatador para o padrão dd-MM-yyyy
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        // Formata ambas as datas para exibição
        String dataEventoFormatada = dataEvento.format(formatador);
        String dataAtualFormatada = dataAtual.format(formatador);


        String statusEvento;

        // isBefore() verifica se a data do evento é anterior à data atual
        if (dataEvento.isBefore(dataAtual)) {
            statusEvento = "O evento já ocorreu.";
        }
        // isAfter() verifica se a data do evento é posterior à data atual
        else if (dataEvento.isAfter(dataAtual)) {
            statusEvento = "O evento ainda está por vir.";
        }
        // Caso as datas sejam iguais
        else {
            statusEvento = "O evento ocorre hoje!";
        }

        System.out.println("Data do evento: " + dataEventoFormatada);
        System.out.println("Data atual: " + dataAtualFormatada);
        System.out.println(statusEvento);
    }
}
