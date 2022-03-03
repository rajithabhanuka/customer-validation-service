package com.code.customervalidationservice.controller;

import com.code.customervalidationservice.dto.LoanApplicationDto;
import com.code.customervalidationservice.service.LoanService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "applications")
public class LoanController {

    private final LoanService loanService;

    public LoanController(LoanService loanService) {
        this.loanService = loanService;
    }

    @PostMapping
    public ResponseEntity<LoanApplicationDto> save(@RequestBody LoanApplicationDto dto) {
        return loanService.save(dto);
    }

    @GetMapping
    public ResponseEntity<List<LoanApplicationDto>> getAll() {
        return loanService.getAll();
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<LoanApplicationDto> getById(
            @PathVariable(value = "id") String id
    ) {
        return loanService.getById(id);
    }
}
