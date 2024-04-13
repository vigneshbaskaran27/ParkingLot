import Controller.TicketController;
import DTO.TicketRequestDTO;
import Repository.GateRepository;
import Repository.ParkingLotRepository;
import Service.TicketService;

public class Client {

    public static void main(String[] args) {

         GateRepository gateRepository = new GateRepository();
         ParkingLotRepository parkingLotRepository=new ParkingLotRepository();

        TicketService ticketService = new TicketService(gateRepository,parkingLotRepository);
        TicketController ticketController= new TicketController(ticketService);



    }

}
