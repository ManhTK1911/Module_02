package Interface_AbstractClass.AnimalAndEdible;

import AnimalAndEdible.edible.Edible;
import Interface_AbstractClass.AnimalAndEdible.animal.Animal;
import Interface_AbstractClass.AnimalAndEdible.animal.Chicken;
import Interface_AbstractClass.AnimalAndEdible.animal.Tiger;
import Interface_AbstractClass.AnimalAndEdible.fruit.Apple;
import Interface_AbstractClass.AnimalAndEdible.fruit.Fruit;
import Interface_AbstractClass.AnimalAndEdible.fruit.Orange;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());;

            if (animal instanceof Chicken) {
                Edible edibler = (Edible) animal;
                System.out.println(edibler.howToEat());
            }
        }

        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }
    }
}