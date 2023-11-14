package org.generation.italy.polymorphism;

import java.time.LocalDate;

public class Developer extends Person {
    private String[] languages;
    private boolean isLazy;
    private LocalDate startOfCareer;

    public Developer(String name, String lastname, long id, LocalDate birthdate, String[] languages,
                     boolean isLazy, LocalDate startOfCareer) {
        super(name, lastname, id, birthdate);
        this.languages = languages;
        this.isLazy = isLazy;
        this.startOfCareer = startOfCareer;
    }

    public Developer(String name, String lastname, long id, LocalDate birthdate, String[] languages,
                     LocalDate startOfCareer){
        this(name, lastname, id, birthdate, languages, true, startOfCareer);
    }

    public Developer(String name, String lastname, long id, LocalDate birthdate, String[] languages){
        this(name, lastname, id, birthdate, languages,true, LocalDate.now());
    }

    public void code(){
        if (isLazy) {
            System.out.println("Programmo 8 ore al giorno");
        } else {
            System.out.println("Programmo 10 ore al giorno");
        }
    }
}
