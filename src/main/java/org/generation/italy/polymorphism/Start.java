package org.generation.italy.polymorphism;

import java.time.LocalDate;

public class Start {
    public static void main(String[] args) {
        Person p = new Person("Paolo", "Lauria", 200, LocalDate.of(1990,6,24));
        String[] languages = {"Java", "C", "Python"};

        Developer d = new Developer("Francesco", "Boo", 300, LocalDate.of(1991, 7, 25),
                languages, true, LocalDate.of(1992, 8, 26));
        Manager m = new Manager("Vito", "Boston", 200, LocalDate.of(1990, 10, 19),
                ManagementLevel.CEO, 2.8);
        Manager m2 = new Manager("Franco", "Google", 400, LocalDate.of(1954, 12, 20),
                ManagementLevel.EXECUTIVE, 1.6);
        FrontendDeveloper fD = new FrontendDeveloper("Giancarlo", "Francest", 600, LocalDate.of(1945, 11, 12),
                languages, true, LocalDate.of(1993, 4, 16), true);
        BackendDeveloper bD = new BackendDeveloper("Paolo", "Story", 400, LocalDate.of(1993, 2, 12), languages,
                true, LocalDate.of(1994, 2, 12), true);

        Person[] ps = new Person[3];
        ps[0] = d;
        ps[1] = fD;
        ps[2] = bD;

        m.fire(fD);
        System.out.println("*******");
        m.fire(bD);
        System.out.println("*******");
        m.fire(ps);


        Developer[] ds = {d, fD, bD};

        ps = ds;

        m.monitor(ds);
    }
}
