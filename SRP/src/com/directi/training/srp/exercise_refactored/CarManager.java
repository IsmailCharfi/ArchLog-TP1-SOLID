package com.directi.training.srp.exercise_refactored;

public class CarManager {
    private CarRepository _carRepository = new CarRepository();
    private CarFormatter _carFormatter = new CarFormatter();
    private CarRater _carRater = new CarRater();

    public Car getBestCar() {
        Car bestCar = null;
        for (Car car : _carRepository.getAll()) {
            if (bestCar == null || this._carRater.isBetter(car, bestCar)) {
                bestCar = car;
            }
        }
        return bestCar;
    }

    public String getCarsNames() {
        return this._carFormatter.formatCarNames(this._carRepository.getAll());
    }
}
