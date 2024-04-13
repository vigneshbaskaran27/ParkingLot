package DTO;

import models.Ticket;

public class TicketResponseDTO {
    private Ticket ticket;
    private String ResponseMessage;

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public String getResponseMessage(String ticket_issued_successfully) {
        return ResponseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        ResponseMessage = responseMessage;
    }
}
