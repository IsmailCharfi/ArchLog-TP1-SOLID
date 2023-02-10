package com.directi.training.lsp.exercise_refactored;

public abstract class Electronic {
    protected boolean _on = false;

    public void turnOn() {
        this._on = true;
    }

    public void turnOff() {
        this._on = false;
    }

}
