package Estagio.Loops;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de degraus da escada: ");
        int degraus = sc.nextInt();

        int i = 1;
        while (i <= degraus) {
            System.out.println("Carla subiu o degrau " + i);
            i++;
        }

        System.out.println("Carla chegou ao topo da escada!");
        sc.close();
    }
}
