package com.code.customervalidationservice.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DrawdownAccount {

    public String bankId;

    public String sortCode;

    public String accountNumber;

    public String swiftCode;
}
