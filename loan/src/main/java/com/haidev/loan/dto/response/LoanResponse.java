package com.haidev.loan.dto.response;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LoanResponse {
    Long id;
    String mobileNumber;
    String loanNumber;
    String loanType;
    int totalLoan;
    int amountPaid;
    int outstandingAmount;
}
