package model.entities.factories;

import model.entities.Car;

public class NissanFactory extends Car implements Comparable {

    public NissanFactory(String name, double fuelCapacity, double secondToHundreds, int price) {
        super(name, fuelCapacity, secondToHundreds, price);
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    @Override
    public void drive() {
        System.out.println(getName() + " is driving");
    }
}
