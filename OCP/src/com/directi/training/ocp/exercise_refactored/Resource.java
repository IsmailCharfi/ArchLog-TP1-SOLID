package com.directi.training.ocp.exercise_refactored;

public abstract class Resource {
    public int id;

    public Resource(int id) {
        this.id = id;
    }

    public abstract int markSlotFree();

    public abstract int markSlotBusy();

    public abstract int findFreeSlot();
}
