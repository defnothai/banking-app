package com.haidev.account.exception;

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

    // ===== Customer validation =====
    NAME_REQUIRED(2001, "Name is required", HttpStatus.BAD_REQUEST),
    NAME_LENGTH_INVALID(2002, "Name length must be between {min} and {max}", HttpStatus.BAD_REQUEST),

    EMAIL_REQUIRED(2003, "Email is required", HttpStatus.BAD_REQUEST),
    EMAIL_INVALID(2004, "Email format is invalid", HttpStatus.BAD_REQUEST),

    PHONE_REQUIRED(2005, "Phone number is required", HttpStatus.BAD_REQUEST),
    PHONE_INVALID(2006, "Phone number format is invalid", HttpStatus.BAD_REQUEST),
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
