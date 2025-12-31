package com.haidev.loan.controller;

import com.haidev.loan.dto.ApiResponse;
import com.haidev.loan.dto.request.LoanRequest;
import com.haidev.loan.dto.response.LoanResponse;
import com.haidev.loan.service.LoanService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequestMapping("/api/v1/loans")
public class LoanController {

    LoanService loanService;

    @PostMapping
    public ApiResponse<LoanResponse> createLoan(@RequestBody LoanRequest loanRequest) {
        var result = loanService.createLoan(loanRequest);
        return ApiResponse.<LoanResponse>builder()
                .result(result)
                .message("Loan created successfully")
                .build();
    }

}
