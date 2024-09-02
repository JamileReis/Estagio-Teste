package Estagio.QuestaoTres;

import java.util.ArrayList;
import java.util.List;

public class CalculadorEstatisticas {
    public static void calcularEstatisticas(List<DiaFaturamento> faturamentos) {
        List<Double> valores = new ArrayList<>();
        double menorValor = Double.MAX_VALUE;
        double maiorValor = Double.MIN_VALUE;
        double soma = 0;

        // Coletar valores e calcular menor, maior e soma
        for (DiaFaturamento df : faturamentos) {
            double valor = df.getValor();
            if (valor > 0) {
                valores.add(valor);
                if (valor < menorValor) menorValor = valor;
                if (valor > maiorValor) maiorValor = valor;
                soma += valor;
            }
        }

        // Verificar se há dados para calcular a média
        if (valores.isEmpty()) {
            System.out.println("Não há dados de faturamento para calcular estatísticas.");
            return;
        }

        // Calcular a média mensal
        double mediaMensal = soma / valores.size();
        int diasAcimaMedia = 0;

        // Contar dias com faturamento acima da média
        for (DiaFaturamento df : faturamentos) {
            if (df.getValor() > mediaMensal) {
                diasAcimaMedia++;
            }
        }

        // Imprimir resultados
        System.out.printf("Menor valor de faturamento: %.2f%n", menorValor);
        System.out.printf("Maior valor de faturamento: %.2f%n", maiorValor);
        System.out.printf("Número de dias com faturamento acima da média: %d%n", diasAcimaMedia);
    }
}
