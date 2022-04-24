package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void zadanie1() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbę studentów");
        int n = scan.nextInt();
        double suma = 0;
        double pkt = 0;
        double ile = 0;

        while (n > 0) {
            System.out.println("Podaj ilosc punktów od 0-50");
            pkt = scan.nextDouble();
            suma = suma + pkt;
            ile++;
            n--;
        }
        System.out.println("ile: " + ile);
        System.out.println("Suma: " + suma);
        System.out.println("Średnia ocen to: " + suma / ile);
    }

    public static void zadanie2() {
        Scanner scan = new Scanner(System.in);
        double iloscLiczb = 4;
        double liczba;
        double suma = 0;
        int ileU = 0;
        int ileD = 0;
        double sumaU = 0;
        double sumaD = 0;
        for (int i = 0; i < iloscLiczb; i++) {
            System.out.println("Podaj liczbę: ");
            liczba = scan.nextDouble();
            if (liczba < 0) {
                ileU++;
                sumaU += liczba;
            }
            if (liczba >= 0) {
                ileD++;
                sumaD += liczba;
            }
            suma += liczba;

        }
        System.out.println("Ilość dodatnich: " + ileD);
        System.out.println("Suma dodatnich: " + sumaD);
        System.out.println("Ilość ujemnych: " + ileU);
        System.out.println("Suma ujemnych: " + sumaU);


    }

    public static void zadanie3() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj długość ciągu, n>0 ");
        int n = scan.nextInt();
        double liczba;
        double suma = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Podaj liczbę: ");
            liczba = scan.nextDouble();
            if (liczba % 2 == 0) {
                suma += liczba;
            }
        }
        System.out.println("Suma przystych liczb wynosi: " + suma);
    }

    public static void zadanie4() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj długość ciągu");
        int n = scan.nextInt();
        Random losowo = new Random();
        int los;
        double suma = 0;
        while (n > 0) {
            los = losowo.nextInt(-10, 45);
            System.out.println(los);
            if (los % 2 == 0) {
                suma += los;
            }
            n--;
        }

        System.out.println("Suma parzystych wyrazów: " + suma);
    }

    public static boolean zadanie5(String tekst) {
        for (int i = 0; i < tekst.length() / 2; i++) {
            char znak = tekst.charAt(i);
            char przeciwnyZnak = tekst.charAt(tekst.length() - 1 - i);

            if (znak != przeciwnyZnak) return false;
        }
        return true;
    }

    public static boolean zadanie5(long liczba) {
        return zadanie5(Long.toString(liczba));
    }

    public static void main(String[] args) {
        zadanie1();
         zadanie2();
        zadanie3();
         zadanie4();
        System.out.println(zadanie5("ala"));
    }
}