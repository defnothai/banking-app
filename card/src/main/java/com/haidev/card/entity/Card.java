package com.haidev.card.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import lombok.AccessLevel;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cards")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "card_id")
    Long id;

    @Column(name = "mobile_number", nullable = false, length = 15)
    String mobileNumber;

    @Column(name = "card_number", nullable = false, unique = true, length = 20)
    String cardNumber;

    @Column(name = "card_type", nullable = false, length = 20)
    String cardType;

    @Column(name = "total_limit", nullable = false)
    int totalLimit;

    @Column(name = "amount_used", nullable = false)
    int amountUsed;

    @Column(name = "available_amount", nullable = false)
    int availableAmount;
}
