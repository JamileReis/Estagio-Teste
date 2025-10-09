package Estagio.StringsRegex;

public class EstudoString {
    public static void main(String[] args) {
        String professor = "Jacqueline Oliveira";

        String disciplina = "Java e Programação Orientada a Objetos";

        String curriculo = ""
                + "Pós-graduada em Engenharia e "
                + "Arquitetura de Software; "
                + "Desenvolvedora backend Java desde 2010; "
                + "";

        String texto = String.format("Disciplina: %s - %s", disciplina, professor);
        System.out.println(texto);

        System.out.printf("Nome: %s %nDisciplina: %s", professor, disciplina);
        System.out.println("\n" + curriculo);
    }
}
