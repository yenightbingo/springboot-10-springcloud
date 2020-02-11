package com.example.provicerticket.serivice;

import org.springframework.stereotype.Service;

@Service
public class TickerService {

    public String getTicket(){
        System.out.println("8001");
        return "<<厉害了，我的国>>";
    }
}
