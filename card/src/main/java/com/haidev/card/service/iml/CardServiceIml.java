package com.haidev.card.service.iml;

import com.haidev.card.dto.request.CardRequest;
import com.haidev.card.dto.response.CardResponse;
import com.haidev.card.entity.Card;
import com.haidev.card.mapper.CardMapper;
import com.haidev.card.repository.CardRepository;
import com.haidev.card.service.CardService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
public class CardServiceIml implements CardService {

    CardRepository cardRepository;
    CardMapper cardMapper;

    @Override
    public CardResponse createCard(CardRequest cardRequest) {
        long randomLoanNumber = 100000000000L + new Random().nextInt(900000000);
        Card card = cardMapper.toCard(cardRequest);
        card.setCardNumber(String.valueOf(randomLoanNumber));
        return cardMapper.toCardResponse(cardRepository.save(card));
    }
}
