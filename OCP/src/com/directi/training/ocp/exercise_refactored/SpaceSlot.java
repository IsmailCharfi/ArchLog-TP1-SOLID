package com.directi.training.ocp.exercise_refactored;

public class SpaceSlot extends Resource {

	public SpaceSlot(int id) {
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