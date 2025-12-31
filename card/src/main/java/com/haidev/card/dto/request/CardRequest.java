package com.haidev.card.dto.request;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CardRequest {

    @NotBlank(message = "MOBILE_NUMBER_REQUIRED")
    @Pattern(
            regexp = "^[0-9]{10,15}$",
            message = "MOBILE_NUMBER_INVALID"
    )
    String mobileNumber;

    @NotBlank(message = "CARD_TYPE_REQUIRED")
    String cardType;

    @NotNull(message = "TOTAL_LIMIT_REQUIRED")
    @Min(value = 1, message = "TOTAL_LIMIT_INVALID")
    Integer totalLimit;

    @NotNull(message = "AMOUNT_USED_REQUIRED")
    @Min(value = 0, message = "AMOUNT_USED_INVALID")
    Integer amountUsed;
}
