package com.haidev.loan.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;

@Getter
public enum ErrorCode {

    // ===== Common =====
    UNCATEGORIZED_EXCEPTION(9999, "Uncategorized error", HttpStatus.INTERNAL_SERVER_ERROR),
    INVALID_KEY(1001, "Uncategorized error", HttpStatus.BAD_REQUEST),

    // ===== User / Customer =====
    USER_EXISTED(1002, "User existed", HttpStatus.BAD_REQUEST),
    USERNAME_INVALID(1003, "Username must be at least {min} characters", HttpStatus.BAD_REQUEST),
    INVALID_PASSWORD(1004, "Password must be at least {min} characters", HttpStatus.BAD_REQUEST),
    USER_NOT_EXISTED(1005, "User not existed", HttpStatus.NOT_FOUND),

    // ===== Auth =====
    UNAUTHENTICATED(1006, "Unauthenticated", HttpStatus.UNAUTHORIZED),
    UNAUTHORIZED(1007, "You do not have permission", HttpStatus.FORBIDDEN),

    // ===== Other =====
    INVALID_DOB(1008, "Your age must be at least {min}", HttpStatus.BAD_REQUEST),

    // ===== Loan validation =====
    PHONE_REQUIRED(3001, "Phone number is required", HttpStatus.BAD_REQUEST),
    PHONE_INVALID(3002, "Phone number format is invalid", HttpStatus.BAD_REQUEST),

    LOAN_NUMBER_REQUIRED(3003, "Loan number is required", HttpStatus.BAD_REQUEST),
    LOAN_NUMBER_LENGTH_INVALID(3004, "Loan number length is invalid", HttpStatus.BAD_REQUEST),

    LOAN_TYPE_REQUIRED(3005, "Loan type is required", HttpStatus.BAD_REQUEST),
    LOAN_TYPE_LENGTH_INVALID(3006, "Loan type length is invalid", HttpStatus.BAD_REQUEST),

    TOTAL_LOAN_INVALID(3007, "Total loan amount must be greater than or equal to 0", HttpStatus.BAD_REQUEST),
    AMOUNT_PAID_INVALID(3008, "Amount paid must be greater than or equal to 0", HttpStatus.BAD_REQUEST),
    OUTSTANDING_AMOUNT_INVALID(3009, "Outstanding amount must be greater than or equal to 0", HttpStatus.BAD_REQUEST),

    ;

    ErrorCode(int code, String message, HttpStatusCode statusCode) {
        this.code = code;
        this.message = message;
        this.statusCode = statusCode;
    }

    private final int code;
    private final String message;
    private final HttpStatusCode statusCode;
}
