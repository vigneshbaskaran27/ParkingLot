package Startegy;

import models.ParkingSlot;
import models.enums.VehicleType;

public interface SlotAssignmentStrategy {

    public ParkingSlot getParkingSlot(VehicleType vehicleType, int gateId);
}
