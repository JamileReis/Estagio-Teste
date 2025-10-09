package Estagio.StringsRegex;

public class Atividade1 {
    public static void main(String[] args) {
        String[] testes = {
                "   João Silva   ",
                "Maria Santos  ",
                "  Pedro Costa",
                "Ana\t",  // com tab
                "\nJosé\n",  // com quebra de linha
                "Carlos"  // sem espaços
        };

        for (String nome : testes) {
            String formatado = nome.trim();
            System.out.println("Original: '" + nome + "' -> Formatado: '" + formatado + "'");
        }
    }
}
