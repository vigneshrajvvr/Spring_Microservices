package com.eazybytes.accounts.service;

import com.eazybytes.accounts.dto.CustomerDto;
import com.eazybytes.accounts.repository.AccountsRepository;
import com.eazybytes.accounts.repository.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AccountsServiceImpl implements IAccountsService{

    private AccountsRepository accountsRepository;

    private CustomerRepository customerRepository;

    @Override
    public void createAccount(CustomerDto customerDto) {

    }
}
