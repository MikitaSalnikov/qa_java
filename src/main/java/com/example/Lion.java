package com.example;

import org.mockito.Mockito;

import java.util.List;

public class Lion {

    Feline feline;
    boolean hasMane;

    public Lion(String sex, Feline fel) throws Exception {
        feline = fel;
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самец или самка");
        }
    }

    public int getKittens() {
        Mockito.when(feline.getKittens()).thenReturn(1);
        return feline.getKittens();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        Mockito.when(feline.getFood(Mockito.anyString())).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        return feline.getFood("Хищник");
    }
}
