package com.example.provicerticket.controller;

import com.example.provicerticket.serivice.TickerService;
import org.springframework.beans.factory.annotation.Autowired;


@RestController
public class TicketController {
    @Autowired
    TickerService tickerService;

    @GetMapping("/ticket")
    public String getTicket(){
        return  tickerService.getTicket();
    }

}
