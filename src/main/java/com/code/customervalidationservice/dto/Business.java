package com.code.customervalidationservice.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Business {

    private String currency;
    
    private Integer monthlyIncome;
    
    private Integer monthlyExpenditure;
    
    private Integer last12MonthGrossIncome;
    
    private Integer last12MonthExpenditures;
    
    private Integer last12MonthTax;
    
    private Loans loans;
    
}
