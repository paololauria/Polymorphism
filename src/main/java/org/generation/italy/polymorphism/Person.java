package org.generation.italy.polymorphism;

import java.time.LocalDate;

public class Person {
    private String name;
    private String lastname;
    private long id;
    private LocalDate birthdate;

    public Person(String name, String lastname, long id, LocalDate birthdate){
        this.name = name;
        this.lastname = lastname;
        this.id = id;
        this.birthdate = birthdate;
    }

    public void greet(){
//        System.out.println("Salve a tutto io sono " + name + " " + lastname);
        System.out.printf("Salve a tutto io sono %s %s%n", name, lastname);
    }

    public void cry(){
        System.out.println("Sigh, sigh!");
    }

}
