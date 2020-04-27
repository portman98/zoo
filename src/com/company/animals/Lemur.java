package com.company.animals;

import com.company.foods.Food;
import com.company.foods.FoodForHerbivore;

public class Lemur extends Herbivore {

    @Override
    public void eat(Food food) {
        if (food instanceof FoodForHerbivore) {
            System.out.println("Покормили травой");
        } else {
            System.out.println("Я такое не ем");
        }
    }

}