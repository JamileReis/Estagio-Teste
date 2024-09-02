package Estagio.Questoes;

public class QuestaoUm {
    public static void main(String[] args) {
        int INDICE = 13;
        int SOMA = 0;
        int K = 0;

        while (K < INDICE) {
            K = K + 1;
            SOMA = SOMA + K;
        }

        System.out.println("Valor da doma é"+" "+SOMA);
    }
}
