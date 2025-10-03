package Estagio.DataHora;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ativadade1 {
    public static void main(String[] args) {
        // Capturar a data e hora atuais do sistema
        LocalDateTime dataHoraAtual = LocalDateTime.now();

        // Criar um formatador para a data no padrão dd-MM-yyyy (dia-mês-ano)
        // dd = dia com dois dígitos (01-31)
        // MM = mês com dois dígitos (01-12)
        // yyyy = ano com quatro dígitos
        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        // Aplicar a formatação à data atual
        String dataFormatada = dataHoraAtual.format(formatoData);

        // Criar um formatador para a hora no padrão HH:mm (hora:minutos)
        // HH = hora no formato 24h com dois dígitos (00-23)
        // mm = minutos com dois dígitos (00-59)
        DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm");

        // Aplicar a formatação à hora atual
        String horaFormatada = dataHoraAtual.format(formatoHora);

        // Exibir os resultados formatados no console
        System.out.println("Data formatada: " + dataFormatada);
        System.out.println("Hora formatada: " + horaFormatada);
    }
}
