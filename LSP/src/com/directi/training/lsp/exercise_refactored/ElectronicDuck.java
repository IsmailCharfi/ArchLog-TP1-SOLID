package com.directi.training.lsp.exercise_refactored;

public class ElectronicDuck extends Electronic implements IDuck
{
    @Override
    public void quack()
    {
        if (this._on) {
            System.out.println("Electronic duck quack...");
        } else {
            throw new RuntimeException("Can't quack when off");
        }
    }

    @Override
    public void swim()
    {
        if (this._on) {
            System.out.println("Electronic duck swim");
        } else {
            throw new RuntimeException("Can't swim when off");
        }
    }
}
