package Estagio.QuestaoQuatro;

import java.util.Map;

public class Calculador {
    // Método para calcular o valor total mensal
    public static double calcularValorTotal(Map<String, Double> faturamentoPorEstado) {
        double valorTotal = 0;
        for (double valor : faturamentoPorEstado.values()) {
            valorTotal += valor;
        }
        return valorTotal;
    }

    // Método para calcular e exibir o percentual de representação de cada estado
    public static void calcularPercentuais(Map<String, Double> faturamentoPorEstado, double valorTotal) {
        System.out.println("Percentual de representação por estado:");
        for (Map.Entry<String, Double> entry : faturamentoPorEstado.entrySet()) {
            String estado = entry.getKey();
            double faturamento = entry.getValue();
            double percentual = (faturamento / valorTotal) * 100;
            System.out.printf("%s: %.2f%%%n", estado, percentual);
        }
    }
}
