package Estagio.DataHora;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Atividade3 {
    public static void main(String[] args) {
        LocalDate dataInicio = LocalDate.now();
        int prazoDias = 15;
        LocalDate dataEntrega = dataInicio.plusDays(prazoDias);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String dataFormatada = dataEntrega.format(formatter);

        System.out.println("Data de entrega: " + dataFormatada);
    }
}
