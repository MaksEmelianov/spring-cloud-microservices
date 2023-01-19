package com.javastart.account.controller.dto;

import com.javastart.account.entiry.Account;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;
import java.util.List;

@NoArgsConstructor
@Getter
public class AccountRequestDTO {

    private String name;
    private String email;
    private String phone;
    private OffsetDateTime offsetDateTime;
    private List<Long> bills;

    public AccountRequestDTO(Account account) {
        name = account.getName();
        email = account.getEmail();
        phone = account.getPhone();
        offsetDateTime = account.getOffsetDateTime();
        bills = account.getBills();
    }
}
