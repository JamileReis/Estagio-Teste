package Estagio.QuestaoQuatro;

import java.util.HashMap;
import java.util.Map;

public class PercentualFaturamento {
    public static void main(String[] args) {
        // Dados de faturamento mensal por estado
        Map<String, Double> faturamentoPorEstado = new HashMap<>();
        faturamentoPorEstado.put("SP", 67836.43);
        faturamentoPorEstado.put("RJ", 36678.66);
        faturamentoPorEstado.put("MG", 29229.88);
        faturamentoPorEstado.put("ES", 27165.48);
        faturamentoPorEstado.put("Outros", 19849.53);

        // Calcular o valor total mensal
        double valorTotal = Calculador.calcularValorTotal(faturamentoPorEstado);

        // Calcular e exibir o percentual de representação de cada estado
        Calculador.calcularPercentuais(faturamentoPorEstado, valorTotal);
    }
}
