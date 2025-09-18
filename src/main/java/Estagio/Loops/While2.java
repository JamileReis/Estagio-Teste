package Estagio.Loops;

public class While2 {
    public static void main(String[] args) {
        int[] valores = {10, 20, 30, 40, 50};
        int soma = 0;
        int i = 0;

        while (i < valores.length) {
            soma += valores[i];
            i++;
        }

        System.out.println("A soma das receitas é: " + soma);
    }
}
