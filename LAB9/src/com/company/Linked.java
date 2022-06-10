package com.company;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Linked {
    public static void main(String[] args) {
        List<Uczestnicy> uczestnicy = new LinkedList<>(Arrays.asList(
                new Uczestnicy("Józef",54,1),
                new Uczestnicy("Adam",89,1),
                new Uczestnicy("Karolina",19,1),
                new Uczestnicy("Alicja",5,1)
        ));
        uczestnicy.add(new Uczestnicy("Wiesław",40,1));
        uczestnicy.add(new Uczestnicy("Lena",2,1));
        System.out.println("Lista uczestników");
        for (Uczestnicy uczestnik: uczestnicy) {
            System.out.println(uczestnik.toString());
        }
    }
}
