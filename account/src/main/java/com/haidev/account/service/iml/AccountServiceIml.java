package com.haidev.account.service.iml;

import com.haidev.account.dto.request.AccountRequest;
import com.haidev.account.dto.request.CustomerRequest;
import com.haidev.account.dto.response.AccountResponse;
import com.haidev.account.dto.response.CustomerResponse;
import com.haidev.account.entity.Account;
import com.haidev.account.entity.Customer;
import com.haidev.account.mapper.AccountMapper;
import com.haidev.account.mapper.CustomerMapper;
import com.haidev.account.repository.AccountRepository;
import com.haidev.account.repository.CustomerRepository;
import com.haidev.account.service.AccountService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class AccountServiceIml implements AccountService {

    CustomerRepository customerRepository;
    AccountRepository accountRepository;
    CustomerMapper customerMapper;
    AccountMapper accountMapper;

    @Override
    public CustomerResponse createAccount(CustomerRequest request) {
        Customer customer = customerRepository.save(
                customerMapper.toCustomer(request)
        );
        Account account = accountMapper.toAccount(new AccountRequest());
        account.setCustomerId(customer.getId());
        AccountResponse accountResponse = accountMapper.toAccountResponse(
                accountRepository.save(account)
        );
        CustomerResponse customerResponse = customerMapper.toCustomerResponse(customer);
        customerResponse.setAccountResponse(accountResponse);
        return customerResponse;
    }
}
