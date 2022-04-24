package com.company;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        prostokąt p1 = new prostokąt(5,7);
        p1.pole();
        p1.obwod();
        p1.przekatna();
        budynek b1 = new budynek("X",2007,2);
        b1.info();
        System.out.println(b1.wiek(2002));
        System.out.println(LocalDate.now());

    }

}
