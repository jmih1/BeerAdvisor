package com.example.brown.beeradvisor;

import java.util.ArrayList;
import java.util.List;

public class BeerExpert {

    public List<String> getBrands(String beerType){
        List<String> brands = new ArrayList<>();

        if (beerType.equals("Brazilian")){
            brands.add("Brazilian Pito");
            brands.add("Brazilian Akpet");
        }

        if (beerType.equals("Italian")){
            brands.add("Italian Pito");
            brands.add("Italian Red wine");
            brands.add("Italian Baileys");
        }

        if (beerType.equals("Ghanaian")){
            brands.add("Guiness");
            brands.add("Star");
            brands.add("Club");
        }
        if (beerType.equals("American")){
            brands.add("American white wine");
            brands.add("Booze");
        }

        return brands;
    }


}
