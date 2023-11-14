package org.generation.italy.polymorphism;

import java.time.LocalDate;

public class BackendDeveloper extends Developer{
    private boolean knowsSQL;

    public BackendDeveloper(String name, String lastname, long id, LocalDate birthdate, String[] languages,
                            boolean isLazy, LocalDate startOfCareer, boolean knowsSQL){
        super(name, lastname, id, birthdate, languages, isLazy, startOfCareer);
        this.knowsSQL = knowsSQL;
    }

    @Override
    public void cry() {
        System.out.println("Io non piango, perchè i backend developer sono dei duri");
    }
}
