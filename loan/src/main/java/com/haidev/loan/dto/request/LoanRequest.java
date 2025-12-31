package com.haidev.loan.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LoanRequest {

    @NotBlank(message = "PHONE_REQUIRED")
    @Pattern(
            regexp = "^(0[3|5|7|8|9])[0-9]{8}$",
            message = "PHONE_INVALID"
    )
    String mobileNumber; // số điện thoại khách hàng

    @Builder.Default
    String loanType = "HOME";

    @Builder.Default
    int totalLoan = 1_000_000; // tổng số tiền vay

    @Builder.Default
    int amountPaid = 0; // số tiền đã trả

    @Builder.Default
    int outstandingAmount = 1_000_000; // số tiền còn nợ
}
