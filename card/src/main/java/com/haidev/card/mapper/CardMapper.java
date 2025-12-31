package com.haidev.card.mapper;

import com.haidev.card.dto.request.CardRequest;
import com.haidev.card.dto.response.CardResponse;
import com.haidev.card.entity.Card;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CardMapper {
    Card toCard(CardRequest request);
    CardResponse toCardResponse(Card card);
}
