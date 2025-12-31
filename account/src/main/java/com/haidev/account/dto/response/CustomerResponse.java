package com.haidev.account.dto.response;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CustomerResponse {
    Long id;
    String name;
    String email;
    String phoneNumber;
    AccountResponse accountResponse;
}
