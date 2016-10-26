package com.company;


import java.util.ArrayList;
import java.util.List;

public class PetCreator {
    //private List<Integer> list;
;

    public ArrayList addPets (int howManyPets)

    {
        //list = new ArrayList<Pet>();
        ArrayList<Pet> petArray = new ArrayList<Pet>();
        for (int i = 0; i < howManyPets; i++) {
            petArray.add(new York());
            petArray.add(new Pug());
            petArray.add(new Labrador());
            petArray.add(new Siamese());
            petArray.add(new Hamster());
            int size = petArray.size();

        }

        return petArray;


    }

}
