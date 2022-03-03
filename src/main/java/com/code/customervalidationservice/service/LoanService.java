package com.code.customervalidationservice.service;

import com.code.customervalidationservice.dto.LoanApplicationDto;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface LoanService {

    ResponseEntity<LoanApplicationDto> save(LoanApplicationDto dto);

    ResponseEntity<List<LoanApplicationDto>> getAll();

    ResponseEntity<LoanApplicationDto> getById(String id);

}
