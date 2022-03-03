package com.code.customervalidationservice.service;

import com.code.customervalidationservice.dto.LoanApplicationDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class LoanServiceImpl implements LoanService{

    @Override
    public ResponseEntity<LoanApplicationDto> save(LoanApplicationDto dto) {
        return null;
    }

    @Override
    public ResponseEntity<List<LoanApplicationDto>> getAll() {
        return null;
    }

    @Override
    public ResponseEntity<LoanApplicationDto> getById(String id) {
        return null;
    }
}
