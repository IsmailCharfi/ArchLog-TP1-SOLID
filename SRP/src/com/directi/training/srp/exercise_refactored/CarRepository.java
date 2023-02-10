package com.directi.training.srp.exercise_refactored;

import java.util.List;

public class CarRepository {
    public Car getOneById(final String carId)
    {
        for (Car car : CarDb.getDb()) {
            if (car.getId().equals(carId)) {
                return car;
            }
        }
        return null;
    }

    public List<Car> getAll()
    {
        return CarDb.getDb();
    }
    
}
