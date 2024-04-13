package models;

import Startegy.FeeCalculationStrategy;
import Startegy.SlotAssignmentStrategy;
import models.enums.ParkingLotStatus;
import models.enums.SlotAssignmentType;

import java.util.List;
import java.util.Map;

public class ParkingLot {
    private int id;
    private String location;
    private List<Gate> gate;
    private List<ParkingFloor> floors;
    private Map<ParkingFloor, Map<ParkingSlot,Integer>> AvailableSlotsByFloor;
    private List<Vehicle> vehicles;
    private List<FeeCalculationStrategy> feeCalculationStrategies;
    private SlotAssignmentType slotAssignmentType;
    private ParkingLotStatus parkingLotStatus;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }



    public List<ParkingFloor> getFloors() {
        return floors;
    }

    public void setFloors(List<ParkingFloor> floors) {
        this.floors = floors;
    }

    public Map<ParkingFloor, Map<ParkingSlot, Integer>> getAvailableSlotsByFloor() {
        return AvailableSlotsByFloor;
    }

    public void setAvailableSlotsByFloor(Map<ParkingFloor, Map<ParkingSlot, Integer>> availableSlotsByFloor) {
        AvailableSlotsByFloor = availableSlotsByFloor;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public List<FeeCalculationStrategy> getFeeCalculationStrategies() {
        return feeCalculationStrategies;
    }

    public void setFeeCalculationStrategies(List<FeeCalculationStrategy> feeCalculationStrategies) {
        this.feeCalculationStrategies = feeCalculationStrategies;
    }


    public List<Gate> getGate() {
        return gate;
    }

    public void setGate(List<Gate> gate) {
        this.gate = gate;
    }

    public ParkingLotStatus getParkingLotStatus() {
        return parkingLotStatus;
    }

    public void setParkingLotStatus(ParkingLotStatus parkingLotStatus) {
        this.parkingLotStatus = parkingLotStatus;
    }



    public SlotAssignmentType getSlotAssignmentType() {
        return slotAssignmentType;
    }

    public void setSlotAssignmentType(SlotAssignmentType slotAssignmentType) {
        this.slotAssignmentType = slotAssignmentType;
    }


}
