package com.haidev.account.dto.request;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AccountRequest {
    @Builder.Default
    String accountType = "SAVINGS";
    @Builder.Default
    String branchAddress = "Thu Duc, HCM";
}
