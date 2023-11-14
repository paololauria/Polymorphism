package org.generation.italy.polymorphism;

import java.time.LocalDate;

public class Manager extends Person {
    private ManagementLevel level;
    private double bonus;

    public Manager(String name, String lastname, long id, LocalDate birthdate, ManagementLevel level, double bonus){
        super(name, lastname, id, birthdate);
        this.level = level;
        this.bonus = bonus;
    }

    public void monitor(Developer[] developers){
        for (Developer d : developers){
            d.code();
        }
    }

    //One reference to rule them all
    public void fire(Person p){
        System.out.println("Sei licenziato!");
        p.cry();
    }

    public void fire(Person[] ps){
        for (Person p : ps){
            System.out.println("Sei licenziato!");
            p.cry();
        }
    }
    @Override
    public void cry() {
        super.cry();
        System.out.println("Che azienda disgraziata!");
    }
}
