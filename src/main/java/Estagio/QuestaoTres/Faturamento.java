package Estagio.QuestaoTres;

import java.io.IOException;
import java.util.List;

public class Faturamento {
    public static void main(String[] args) {
        String arquivoJson = "C:\\Users\\mile_\\OneDrive\\Área de Trabalho\\Questoes\\src\\main\\java\\Estagio\\QuestaoTres\\faturamento.json"; // Ajuste o caminho conforme necessário

        try {
            // Carregar dados do arquivo JSON
            List<DiaFaturamento> faturamentos = CarregadorDados.carregarDados(arquivoJson);

            // Calcular e imprimir estatísticas
            CalculadorEstatisticas.calcularEstatisticas(faturamentos);
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo JSON: " + e.getMessage());
        }
    }
}
