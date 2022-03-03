package com.code.customervalidationservice.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoanDetails {

    private String currency;

    private Integer requestedAmount;

    private Integer requestedPeriod;

    private Double requestedInterestRate;

    private Integer approvedAmount;

    private Integer approvedMinAmount;

    private Integer approvedMaxAmount;

    private Integer approvedPeriod;

    private Integer approvedMinPeriod;

    private Integer approvedMaxPeriod;

    private Double approvedInterestRate;
    
    private String status;
}
