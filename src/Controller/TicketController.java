package Controller;


import DTO.TicketRequestDTO;
import DTO.TicketResponseDTO;
import Service.TicketService;
import exceptions.GateNotFoundException;
import models.Ticket;

public class TicketController {

    private TicketService ticketService;

    public TicketController(TicketService ticketService)
    {
        this.ticketService=ticketService;
    }

    public TicketResponseDTO IssueTicket(TicketRequestDTO ticketRequestDTO) throws GateNotFoundException {
         Ticket ticket = null;
         TicketResponseDTO ticketResponseDTO = new TicketResponseDTO();
         try
        {
            ticket = ticketService.IssueTicket(ticketRequestDTO.getGateId(), ticketRequestDTO.getNumber(), ticketRequestDTO.getName(), ticketRequestDTO.getTime(), ticketRequestDTO.getVehicleType());

        }
         catch (GateNotFoundException gnfe)
         {
             ticketResponseDTO.setTicket(ticket);
             ticketResponseDTO.getResponseMessage("Gate id does not exist");
             return ticketResponseDTO;
         }
         catch (Exception e)
         {
             ticketResponseDTO.setTicket(ticket);
             ticketResponseDTO.getResponseMessage("Ticket Issued Successfully");
             return ticketResponseDTO;
         }

        ticketResponseDTO.setTicket(ticket);
        ticketResponseDTO.getResponseMessage("Ticket Issued Successfully");
        return ticketResponseDTO;
    }

}
