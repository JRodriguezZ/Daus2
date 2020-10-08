package com.company;

import java.util.Scanner;

public class JocDaus {
    Dau dau[] = new Dau[3];

    public JocDaus() {
        dau[0]= new Dau();
        dau[1]= new Dau();
        dau[2]= new Dau();
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        int seleccion;
        do {
            Menu.partidasJugadas++;
            dau[0].tirar();
            dau[1].tirar();
            dau[2].tirar();

            System.out.println();
            System.out.print("Dados: ");
            System.out.print(dau[0].getValor() + " ");
            System.out.print(dau[1].getValor() + " ");
            System.out.println(dau[2].getValor());

            if (dau[0].getValor() == dau[1].getValor() && dau[1].getValor() == dau[2].getValor()) {
                System.out.println("Has ganado");
                Menu.partidasGanadas++;
            } else {
                System.out.println("Has perdido");
                Menu.partidasPerdidas++;
            }

            System.out.println();
            System.out.println("Quieres volver a jugar? 1 = si | 2 = no");
            seleccion = scanner.nextInt();
        } while (seleccion == 1);

    }
}
