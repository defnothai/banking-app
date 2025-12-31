package com.haidev.card.controller;

import com.haidev.card.dto.ApiResponse;
import com.haidev.card.dto.request.CardRequest;
import com.haidev.card.dto.response.CardResponse;
import com.haidev.card.service.CardService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/cards")
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class CardController {

    CardService cardService;

    @PostMapping
    public ApiResponse<CardResponse> createCard(@RequestBody CardRequest cardRequest) {
        var result = cardService.createCard(cardRequest);
        return ApiResponse.<CardResponse>builder()
                .message("Card created successfully")
                .result(result)
                .build();
    }

}
