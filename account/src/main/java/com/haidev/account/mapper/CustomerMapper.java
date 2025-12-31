package com.haidev.account.mapper;

import com.haidev.account.dto.request.CustomerRequest;
import com.haidev.account.dto.response.CustomerResponse;
import com.haidev.account.entity.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    Customer toCustomer(CustomerRequest request);
    CustomerResponse toCustomerResponse(Customer customer);

}
