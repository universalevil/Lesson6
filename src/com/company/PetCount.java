package com.company;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PetCount {

    //public HashMap<Class<?>, Class<?>> map = new HashMap<Class<?>, Class<?>>();
    Map<String, Integer> map = new HashMap<String, Integer>();
    String word;

    public void printPets () {
    PetCreator petCreator = new PetCreator();
    ArrayList petArray = petCreator.addPets(3);
    System.out.println(petArray);

    /* if (map.containsKey(word.toLowerCase()) ) {
        int temp = map.get(word.toLowerCase()) + 1;
        map.put(word.toLowerCase(), temp);
    } else {
        map.put(word.toLowerCase(), 1);
    }

        //System.out.println(map);*/
    }
}
