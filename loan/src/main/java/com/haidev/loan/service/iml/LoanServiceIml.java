package com.haidev.loan.service.iml;

import com.haidev.loan.dto.request.LoanRequest;
import com.haidev.loan.dto.response.LoanResponse;
import com.haidev.loan.entity.Loan;
import com.haidev.loan.mapper.LoanMapper;
import com.haidev.loan.repository.LoanRepository;
import com.haidev.loan.service.LoanService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
public class LoanServiceIml implements LoanService {

    LoanRepository loanRepository;
    LoanMapper loanMapper;

    @Override
    public LoanResponse createLoan(LoanRequest request) {
        long randomLoanNumber = 100000000000L + new Random().nextInt(900000000);
        Loan loan = loanMapper.toLoan(request);
        loan.setLoanNumber(String.valueOf(randomLoanNumber));
        return loanMapper.toLoanResponse(loanRepository.save(loan));
    }
}
