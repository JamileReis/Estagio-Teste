package Estagio.Loops;

import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de degraus da escada: ");
        int degraus = sc.nextInt();

        for (int i = 1; i <= degraus; i++) {
            System.out.println("Carla subiu o degrau " + i);
        }

        System.out.println("Carla chegou ao topo da escada!");
        sc.close();
    }
}
