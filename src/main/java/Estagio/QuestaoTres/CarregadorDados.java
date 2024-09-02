package Estagio.QuestaoTres;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarregadorDados {
    public static List<DiaFaturamento> carregarDados(String arquivo) throws IOException {
        List<DiaFaturamento> faturamentos = new ArrayList<>();
        try (FileReader reader = new FileReader(arquivo)) {
            StringBuilder sb = new StringBuilder();
            Scanner scanner = new Scanner(reader);
            while (scanner.hasNextLine()) {
                sb.append(scanner.nextLine());
            }
            scanner.close();

            // Verificar o conteúdo do arquivo
            String jsonString = sb.toString();
            if (jsonString.trim().isEmpty()) {
                throw new IOException("O arquivo JSON está vazio.");
            }

            // Criação do objeto JSON
            JSONObject json = new JSONObject(jsonString);
            JSONArray jsonArray = json.getJSONArray("faturamentos");

            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject obj = jsonArray.getJSONObject(i);
                int dia = obj.getInt("dia");
                double valor = obj.getDouble("valor");
                faturamentos.add(new DiaFaturamento(dia, valor));
            }
        }
        return faturamentos;
    }
}
