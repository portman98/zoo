package com.company;

import com.company.animals.Giraffe;
import com.company.animals.Herbivore;
import com.company.animals.Lion;
import com.company.cells.Cell;
import com.company.foods.Grass;
import com.company.foods.Meat;

public class Main {

    public static void main(String[] args) {
        Cell<Herbivore> cell = new Cell<>(2);
        Meat meat = new Meat();
        Grass grass = new Grass();

        Giraffe giraffe = new Giraffe();
        giraffe.eat(grass);

        Lion lion = new Lion();
        lion.eat(grass);

        cell.addAnimal(giraffe);
    }
}