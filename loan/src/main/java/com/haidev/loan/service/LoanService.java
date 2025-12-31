package com.haidev.loan.service;

import com.haidev.loan.dto.request.LoanRequest;
import com.haidev.loan.dto.response.LoanResponse;

public interface LoanService {

    LoanResponse createLoan(LoanRequest request);

}
