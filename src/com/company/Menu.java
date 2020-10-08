package com.company;

import java.util.Scanner;

public class Menu {
    public Scanner scanner = new Scanner(System.in);
    public static int partidasJugadas;
    public static int partidasGanadas;
    public static int partidasPerdidas;

    JocDaus jocDaus = new JocDaus();

    public void start() {
        menuPrincipal();
    }

    public void menuPrincipal() {
        System.out.println("Bienvenido al juego de los dados");
        System.out.println("-- Game Menu --");
        System.out.println("1. Play");
        System.out.println("2. Settings");
        System.out.println("3. Exit");

        int seleccio = scanner.nextInt();

        if (seleccio == 1) play();
        else if (seleccio == 2) settings();
        else if (seleccio == 3) exit();
        else {
            System.out.println("Valor introducido incorrecto.");
            menuPrincipal();
        };

    }

    public  void play() {
        jocDaus.start();
        menuPrincipal();

    }

    private void settings() {
        System.out.println();
        System.out.println("-- Settings Menu --");
        System.out.println("1. Resetear estadisticas");
        System.out.println("2. Comprobar estadisticas");
        System.out.println("3. Return");

        int seleccio = scanner.nextInt();

        if (seleccio == 1) {
            partidasJugadas = 0;
            partidasGanadas = 0;
            partidasPerdidas = 0;
            settings();
        }
        else if (seleccio == 2) {
            System.out.println();
            System.out.println("Partidas jugadas: " + partidasJugadas);
            System.out.println("Partidas ganadas: " + partidasGanadas);
            System.out.println("Partidas perdidas: " + partidasPerdidas);
            System.out.println("1 para continuar.");
            seleccio = scanner.nextInt();
            settings();
        }
        else if (seleccio == 3) menuPrincipal();
        else {
            System.out.println("Valor introducido incorrecto.");
            menuPrincipal();
        };

    }

    private void exit() {
        System.out.println();
        System.out.println("Partidas jugadas: " + partidasJugadas);
        System.out.println("Partidas ganadas: " + partidasGanadas);
        System.out.println("Partidas perdidas: " + partidasPerdidas);
        System.out.println("-- Gracias por jugar! --");
    }
}
