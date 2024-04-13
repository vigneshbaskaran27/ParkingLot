package Startegy;

import Repository.ParkingLotRepository;
import models.ParkingFloor;
import models.ParkingLot;
import models.ParkingSlot;
import models.enums.ParkingSlotStatus;
import models.enums.VehicleType;

import java.util.List;

public class RandomParkingLotSlot implements SlotAssignmentStrategy{


    ParkingLotRepository parkingLotRepository;
    public RandomParkingLotSlot(ParkingLotRepository parkingLotRepository)
    {
        this.parkingLotRepository=parkingLotRepository;
    }

    @Override
    public ParkingSlot getParkingSlot(VehicleType vehicleType, int gateId) {
        ParkingLot parkingLot=parkingLotRepository.getParkingLotByGateId(gateId);
        for(ParkingFloor floors: parkingLot.getFloors())
        {
            for(ParkingSlot parkingSlot : floors.getParkingSlotList())
            {
                if(parkingSlot.getParkingSlotStatus().equals(ParkingSlotStatus.EMPTY) &&
                    parkingSlot.getVehicleType().equals(vehicleType))
                {
                    return parkingSlot;
                }
            }
        }
        return null;
    }
}
