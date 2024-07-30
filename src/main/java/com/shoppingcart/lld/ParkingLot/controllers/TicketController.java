package com.shoppingcart.lld.ParkingLot.controllers;

import com.shoppingcart.lld.ParkingLot.dtos.IssueTicketRequestDTO;
import com.shoppingcart.lld.ParkingLot.dtos.IssueTicketResponseDTO;
import com.shoppingcart.lld.ParkingLot.dtos.ResponseStatus;
import com.shoppingcart.lld.ParkingLot.models.Ticket;
import com.shoppingcart.lld.ParkingLot.service.TicketService;

public class TicketController {
    private TicketService ticketService;

    public TicketController(TicketService ticketService){
        this.ticketService = ticketService;
    }

    public IssueTicketResponseDTO issueTicket(IssueTicketRequestDTO requestDTO){
        IssueTicketResponseDTO responseDTO = new IssueTicketResponseDTO();

        try {
            Ticket ticket = ticketService.issueTicket(requestDTO.getGateId(),
                    requestDTO.getVehicleNumber(),
                    requestDTO.getVehicleOwner(),
                    requestDTO.getVehicleType());

            responseDTO.setTicket(ticket);
            responseDTO.setResponseStatus(ResponseStatus.SUCCESS);
        }
        catch (Exception ex){
            ex.getMessage();
            responseDTO.setResponseStatus(ResponseStatus.FAILED);
        }
        return responseDTO;
    }
}
