package com.code.customervalidationservice.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class LoanApplicationDto {

    private ProductDetails productDetails;
    
    private ApplicantDetails applicantDetails;
    
    private EmploymentDetails employmentDetails;
    
    private List<Guarantor> guarantors;
    
    private Credit credit;
    
    private Repayment repayment;
    
    private DrawdownAccount drawdownAccount;
    
    private LoanDetails loanDetails;
}
