package Estagio.DataHora;

import java.time.Duration;
import java.time.LocalTime;

public class Atividade2 {
    public static void main(String[] args) {

        // Horário de início da atividade (14:30:00)
        LocalTime inicio = LocalTime.of(14, 30, 0);

        // Horário de término da atividade (16:45:00)
        LocalTime termino = LocalTime.of(16, 45, 0);

        // CÁLCULO DA DIFERENÇA ENTRE OS HORÁRIOS

        // Duration.between() calcula a diferença entre dois horários
        // Retorna um objeto Duration com a diferença em segundos/nanos
        Duration duracao = Duration.between(inicio, termino);

        // EXTRAÇÃO DE HORAS E MINUTOS DA DURAÇÃO
        // toHours() converte a duração total para horas (parte inteira)
        // Exemplo: 2 horas e 15 minutos → 2 horas
        long horas = duracao.toHours();

        // toMinutesPart() retorna os minutos restantes após remover as horas completas
        // Exemplo: 2 horas e 15 minutos → 15 minutos
        long minutos = duracao.toMinutesPart();

        // EXIBIÇÃO DO RESULTADO FORMATADO

        System.out.println("Diferença de tempo: " + horas + " horas e " + minutos + " minutos");
    }
}
