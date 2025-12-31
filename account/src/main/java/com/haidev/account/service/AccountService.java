package com.haidev.account.service;

import com.haidev.account.dto.request.CustomerRequest;
import com.haidev.account.dto.response.CustomerResponse;

public interface AccountService {

    CustomerResponse createAccount(CustomerRequest request);

}
