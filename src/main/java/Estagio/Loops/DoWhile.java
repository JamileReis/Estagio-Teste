package Estagio.Loops;

public class DoWhile {
    public static void main(String[] args) {
        int[] valores = {10, 20, 30, 40, 50};
        int soma = 0;
        int i = 0;

        do {
            soma += valores[i];
            i++;
        } while (i < valores.length);

        System.out.println("A soma das receitas é: " + soma);
    }
}
