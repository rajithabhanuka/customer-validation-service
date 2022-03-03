package com.code.customervalidationservice.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class EmploymentDetails {

    private String companyName;

    private String legalName;

    private String companyType;

    private String tradingSince;

    private String description;

    private String companyId;

    private List<ContactDetail> contactDetails;

    private List<Address> addresses;

}
