package Startegy;

import Repository.ParkingLotRepository;
import models.enums.SlotAssignmentType;

public class SlotAssignmentFactory {

    public static SlotAssignmentStrategy getSlotAssignmentByType(SlotAssignmentType slotAssignmentType, ParkingLotRepository parkingLotRepository)
    {
        if(slotAssignmentType.equals(SlotAssignmentType.RANDOM))
        {
            return new RandomParkingLotSlot(parkingLotRepository);
        }
    }
}
