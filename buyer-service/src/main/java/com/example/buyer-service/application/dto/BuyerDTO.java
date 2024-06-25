package com.example.buyer-service.application.dto;

import lombok.Data;

@Data
public class BuyerDTO {
    private int id;
    private String fullName;
    private String email;
    private String phoneNumber;
    private String address;
}

