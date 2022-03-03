package com.code.customervalidationservice.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Repayment {

    private String drawdownDate;
    
    private String firstRepaymentDate;
    
    private Integer repaymentAmount;
    
    private Integer drawdownAmount;
    
    private Integer drawdownPeriod;

}
