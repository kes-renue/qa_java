package com.example;

import java.util.List;

public class LionAlex extends Lion {

    final Feline feline;

    public LionAlex(Feline feline) throws Exception{
        super(new Feline(), "Самец");
        this.feline = feline;
    }

    public List<String> getFriends(){
        return List.of("Марти", "Глория", "Мелман");
    }

    public String getPlaceOfLiving(){
        return "Нью-Йоркский зоопарк";
    }

    @Override
    public int getKittens(){
        return feline.getKittens(0);
    }
}
