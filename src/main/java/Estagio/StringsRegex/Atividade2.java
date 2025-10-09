package Estagio.StringsRegex;

public class Atividade2 {
    public static void main(String[] args) {
        String[] textosTeste = {
                "Olá, Mundo!",
                "Java é INCRÍVEL",
                "PROGRAMAÇÃO em ação",
                "Texto Com ACENTUAÇÃO: áéíóú",
                "123 números e SÍMBOLOS! @#$"
        };

        for (String texto : textosTeste) {
            System.out.println("Original: " + texto);
            System.out.println("Maiúsculas: " + texto.toUpperCase());
            System.out.println("Minúsculas: " + texto.toLowerCase());
            System.out.println("---");
        }
    }
}
