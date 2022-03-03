package com.code.customervalidationservice.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ApplicantDetails {

    private String firstName;
    
    private String surname;
    
    private String fullName;
    
    private String title;
    
    private String designation;
    
    private List<ContactDetail> contactDetails;
    
    private List<Address> addresses;
}
