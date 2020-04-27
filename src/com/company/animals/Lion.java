package com.company.animals;

import com.company.foods.Food;
import com.company.foods.FoodForCarnivorous;

public class Lion extends Carnivorous {

    @Override
    public void eat(Food food) {
        if (food instanceof FoodForCarnivorous) {
            System.out.println("Покормили травой");
        } else {
            System.out.println("Я такое не ем");
        }
    }

}