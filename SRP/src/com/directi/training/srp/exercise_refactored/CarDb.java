package com.directi.training.srp.exercise_refactored;

import java.util.Arrays;
import java.util.List;

public class CarDb {
    private static List<Car> _carsDb = null;

    public static List<Car> getDb() {
        if (CarDb._carsDb == null) {
            CarDb._carsDb = Arrays
                    .asList(
                            new Car("1", "Golf III", "Volkswagen"),
                            new Car("2", "Multipla", "Fiat"),
                            new Car("3", "Megane", "Renault"));
        }

        return CarDb._carsDb;
    }
}