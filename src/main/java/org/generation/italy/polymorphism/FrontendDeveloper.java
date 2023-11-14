package org.generation.italy.polymorphism;

import java.time.LocalDate;

public class FrontendDeveloper extends Developer {
    private boolean isArtist;

    public FrontendDeveloper(String name, String lastname, long id, LocalDate birthdate, String[] languages,
                            boolean isLazy, LocalDate startOfCareer, boolean isArtist){
        super(name, lastname, id, birthdate, languages, isLazy, startOfCareer);
        this.isArtist = isArtist;
    }


    @Override
    public void code(){
        System.out.println("Faccio disegnini con CSS");
    }
}
