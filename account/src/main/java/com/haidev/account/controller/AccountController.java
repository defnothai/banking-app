package com.haidev.account.controller;

import com.haidev.account.dto.ApiResponse;
import com.haidev.account.dto.request.CustomerRequest;
import com.haidev.account.service.AccountService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Tag(
        name = "Account Controller For Banking App",
        description = "APIs for managing accounts"
)
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/accounts")
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class AccountController {

    AccountService accountService;

    @Operation(
            summary = "Create Account API",
            description = "API to create a new account along with customer details"
    )
    @io.swagger.v3.oas.annotations.responses.ApiResponse(
            responseCode = "200",
            description = "HTTP Status OK"
    )
    @PostMapping
    public ApiResponse<?> createAccount(@RequestBody @Valid CustomerRequest request) {
        var result = accountService.createAccount(request);
        return ApiResponse.builder()
                .message("Account created successfully")
                .result(result)
                .build();
    }

}
