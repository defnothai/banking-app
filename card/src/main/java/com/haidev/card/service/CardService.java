package com.haidev.card.service;

import com.haidev.card.dto.request.CardRequest;
import com.haidev.card.dto.response.CardResponse;

public interface CardService {
    CardResponse createCard(CardRequest cardRequest);

}
