package com.code.customervalidationservice.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Guarantor {

    private String firstName;

    private String surname;

    private String title;

    private String designation;

    private String company;

    private List<ContactDetail> contactDetails;
    
    private List<Address> addresses;
}
