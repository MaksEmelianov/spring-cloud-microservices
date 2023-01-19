package com.javastart.account.controller.dto;

import com.javastart.account.entiry.Account;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.OffsetDateTime;
import java.util.List;

@AllArgsConstructor
@Getter
public class AccountResponseDTO {

    private Long accountId;
    private String name;
    private String email;
    private String phone;
    private List<Long> bills;
    private OffsetDateTime offsetDateTime;

    public AccountResponseDTO(Account account) {
        accountId = account.getAccountId();
        name = account.getName();
        email = account.getEmail();
        phone = account.getPhone();
        bills = account.getBills();
        offsetDateTime = account.getOffsetDateTime();
    }
}
