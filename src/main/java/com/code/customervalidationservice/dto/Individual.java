package com.code.customervalidationservice.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Individual {

    private String currency;

    private Integer monthlyIncome;

    private Integer monthlyExpenditure;

    private CreditCards creditCards;

    private Loans loans;
}
