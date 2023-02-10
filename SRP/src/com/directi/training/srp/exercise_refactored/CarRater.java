package com.directi.training.srp.exercise_refactored;

public class CarRater {
    public int rate(Car a, Car b) {
        return a.getModel().compareTo(b.getModel());
    }

    public boolean isBetter(Car a, Car b) {
        return this.rate(a, b) > 0;
    }

    public boolean isWorse(Car a, Car b) {
        return this.rate(a, b) < 0;
    }
}
