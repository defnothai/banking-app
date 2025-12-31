package com.haidev.loan.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Loan {   // khoản vay

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "loan_id")
    Long id;

    @Column(name = "mobile_number")
    String mobileNumber; // số điện thoại khách hàng

    @Column(name = "loan_number")
    String loanNumber; // số hợp đồng vay

    @Column(name = "loan_type")
    String loanType;  // loại khoản vay

    @Column(name = "total_loan")
    int totalLoan;  // tổng số tiền vay

    @Column(name = "amount_paid")
    int amountPaid; // số tiền đã trả

    @Column(name = "outstanding_amount")
    int outstandingAmount;  // số tiền còn nợ
}
