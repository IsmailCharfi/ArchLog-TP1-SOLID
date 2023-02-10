package com.directi.training.ocp.exercise_refactored;

public class TimeSlot extends Resource {

    public TimeSlot(int id) {
        super(id);
    }

	public int markSlotFree() {
		// ...
		return this.id;
	}

	public int markSlotBusy() {
		// ...
		return this.id;
	}

    public int findFreeSlot() {
        return 0;
    }

}