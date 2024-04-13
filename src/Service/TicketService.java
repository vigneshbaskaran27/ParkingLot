package Service;

import Repository.GateRepository;
import Repository.ParkingLotRepository;
import Startegy.SlotAssignmentFactory;
import Startegy.SlotAssignmentStrategy;
import exceptions.GateNotFoundException;
import models.Gate;
import models.ParkingLot;
import models.ParkingSlot;
import models.Ticket;
import models.enums.SlotAssignmentType;
import models.enums.VehicleType;

import java.time.LocalTime;
import java.util.Date;
import java.util.Optional;

public class TicketService {

    private GateRepository gateRepository;
    private ParkingLotRepository parkingLotRepository;

    public TicketService(GateRepository gateRepository,ParkingLotRepository parkingLotRepository )
    {
        this.gateRepository=gateRepository;
        this.parkingLotRepository=parkingLotRepository;
    }

    public Ticket IssueTicket(int gateId,int number , String name , Date time, VehicleType vehicleType ) throws GateNotFoundException {

        //1.Create the ticket object
        //2.assign the slot
        //3.return the ticket
        Ticket ticket = new Ticket();
        ticket.setLocalTime(new Date());


        Optional<Gate> gateOptional= gateRepository.getGateById(gateId);

        if(gateOptional.isEmpty())
        {
            throw new GateNotFoundException();
        }

        ticket.setGateId(gateId);

        SlotAssignmentType slotAssignmentType=parkingLotRepository.getParkingLotByGateId(gateId).getSlotAssignmentType();
        ParkingSlot parkingSlot=SlotAssignmentFactory.getSlotAssignmentByType(slotAssignmentType,parkingLotRepository).getParkingSlot(vehicleType,gateId);
        ticket.setParkingSlot(parkingSlot);

        return ticket;
    }
}
