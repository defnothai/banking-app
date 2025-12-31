package com.haidev.card.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;

@Getter
public enum ErrorCode {

    // ===== Common =====
    UNCATEGORIZED_EXCEPTION(9999, "Uncategorized error", HttpStatus.INTERNAL_SERVER_ERROR),
    INVALID_KEY(1001, "Invalid key", HttpStatus.BAD_REQUEST),

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

    // ===== Card =====
    MOBILE_NUMBER_REQUIRED(2001, "Mobile number is required", HttpStatus.BAD_REQUEST),
    MOBILE_NUMBER_INVALID(2002, "Mobile number is invalid", HttpStatus.BAD_REQUEST),

    CARD_NUMBER_REQUIRED(2003, "Card number is required", HttpStatus.BAD_REQUEST),
    CARD_NUMBER_INVALID(2004, "Card number is invalid", HttpStatus.BAD_REQUEST),

    CARD_TYPE_REQUIRED(2005, "Card type is required", HttpStatus.BAD_REQUEST),

    TOTAL_LIMIT_REQUIRED(2006, "Total limit is required", HttpStatus.BAD_REQUEST),
    TOTAL_LIMIT_INVALID(2007, "Total limit must be greater than 0", HttpStatus.BAD_REQUEST),

    AMOUNT_USED_REQUIRED(2008, "Amount used is required", HttpStatus.BAD_REQUEST),
    AMOUNT_USED_INVALID(2009, "Amount used must be greater than or equal to 0", HttpStatus.BAD_REQUEST),

    AMOUNT_USED_EXCEEDS_LIMIT(
            2010,
            "Amount used must not exceed total limit",
            HttpStatus.BAD_REQUEST
    );

    ErrorCode(int code, String message, HttpStatusCode statusCode) {
        this.code = code;
        this.message = message;
        this.statusCode = statusCode;
    }

    private final int code;
    private final String message;
    private final HttpStatusCode statusCode;
}
