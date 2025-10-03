package Estagio.DataHora;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Atividade6 {
    public static void main(String[] args) {
        // CRIA um objeto ZonedDateTime representando o horário atual em Tóquio
        // ZonedDateTime.now() captura o instante atual do sistema
        // ZoneId.of("Asia/Tokyo") define o fuso horário específico para Tóquio
        // Isso considera:
        // - Horário de verão (se aplicável)
        // - Offset UTC+9 (Japan Standard Time)
        // - Regras específicas do fuso horário asiático
        ZonedDateTime horarioTokyo = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));

        // CRIA um formatador personalizado para exibir apenas HORA-MINUTO-SEGUNDO
        // DateTimeFormatter.ofPattern() define um padrão customizado
        // "HH" = Hora em formato 24h com dois dígitos (00-23)
        // "mm" = Minutos com dois dígitos (00-59)
        // "ss" = Segundos com dois dígitos (00-59)
        // Os ":" são caracteres literais separadores
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        // APLICA o formatador ao horário de Tóquio
        // format() converte o objeto ZonedDateTime para String
        // seguindo o padrão definido no DateTimeFormatter
        // Exemplo de resultado: "14:30:25"
        String horarioFormatado = horarioTokyo.format(formatter);

        // EXIBE o resultado formatado no console
        // Concatena o texto fixo com a string formatada do horário
        // Saída exemplo: "Horário atual em Tóquio: 14:30:25"
        System.out.println("Horário atual em Tóquio: " + horarioFormatado);
    }
}
