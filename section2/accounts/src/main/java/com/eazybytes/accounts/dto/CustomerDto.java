package com.eazybytes.accounts.dto;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class CustomerDto {

    private String name;

    private String email;

    private String mobileNumber;

}
