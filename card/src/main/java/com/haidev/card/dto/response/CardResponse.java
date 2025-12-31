package com.haidev.card.dto.response;

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
public class CardResponse {
    Long id;
    String mobileNumber;
    String cardNumber;
    String cardType;
    int totalLimit;
    int amountUsed;
    int availableAmount;
}
