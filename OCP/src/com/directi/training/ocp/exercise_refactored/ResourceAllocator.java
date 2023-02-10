package com.directi.training.ocp.exercise_refactored;

public abstract class ResourceAllocator {
    public int allocate(Resource res) {
        return res.markSlotBusy();
    }

    public int free(Resource res) {
        return res.markSlotFree();
    }

}
