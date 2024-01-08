package com.eazybytes.accounts.service;

import com.eazybytes.accounts.dto.CustomerDto;

public interface IAccountsService {

    /**
     *
     * @param customerDto - CustomerDto object
     */
    void createAccount(CustomerDto customerDto);

    /**
     *
     * @param mobileNumber
     * @return Account Details based on given mobileNumber
     */
    CustomerDto fetchAccount(String mobileNumber);

}
