package Repository;

import models.Gate;
import models.ParkingLot;
import models.ParkingSlot;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ParkingLotRepository {
    Map<Integer, ParkingLot> parkingLotMap= new TreeMap<>();

    public ParkingLot getParkingLotByGateId(int gateId)
    {
        for(ParkingLot parkingLot: parkingLotMap.values())
        {
            List<Gate> gates=parkingLot.getGate();
            for(Gate gate: gates)
            {
                if(gate.getId() == gateId)
                {
                    return parkingLot;
                }
            }

        }

        return null;
    }

}
