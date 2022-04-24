package com.company;

public class Main {

    public static void main(String[] args) {
        zadanie2(5,6);
        parzysta(9);
        System.out.println("Liczba do trzeciej potęgi: "+trzecia(8));
        System.out.println(trojkat(6,8,10));

    }

    //zadanie 2
    public static void zadanie2(double a, double b) {
        System.out.println("Suma liczb a i b wynosi: " + (a + b));
        System.out.println("Różnica liczb a i b wynosi: " + (a - b));
        System.out.println("Iloczyn liczb a i b wynosi: " + (a * b));
    }
    //zadanie 3
    public static void parzysta(int liczba)
    {
        if(liczba%2==0)
            System.out.println("Liczba jest parzysta.");
        else System.out.printf("Liczba jest nieparzysta.");
    }
    //zadanie 5
    public static int trzecia(double a){
        return (int) Math.pow(a,3);
    }
    //zadanie 6.
    public static double pierwiastekkwadratowy(double a){
        return Math.sqrt(a);
    }
    //zadanie 7.
    public static boolean trojkat(double a, double b, double c) {
        if((Math.pow(a,2)+Math.pow(b,2))==(Math.pow(c,2)))
            return true;
        else return false;
    }

}