package com.haidev.account.mapper;

import com.haidev.account.dto.request.AccountRequest;
import com.haidev.account.dto.response.AccountResponse;
import com.haidev.account.entity.Account;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AccountMapper {

    Account toAccount(AccountRequest accountRequest);
    AccountResponse toAccountResponse(Account account);

}
