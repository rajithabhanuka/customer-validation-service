package com.code.customervalidationservice.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Address {

    private String addressType;
    
    private String line1;
    
    private String line2;
    
    private String line3;
    
    private String buildingName;
    
    private String buildingNumber;
    
    private String apartmentName;
    
    private String city;
    
    private String county;
    
    private String postcode;
    
    private String country;

}
