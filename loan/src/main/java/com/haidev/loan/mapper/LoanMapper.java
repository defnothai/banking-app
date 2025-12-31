package com.haidev.loan.mapper;

import com.haidev.loan.dto.request.LoanRequest;
import com.haidev.loan.dto.response.LoanResponse;
import com.haidev.loan.entity.Loan;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface LoanMapper {

    Loan toLoan(LoanRequest loanRequest);
    LoanResponse toLoanResponse(Loan loan);

}
