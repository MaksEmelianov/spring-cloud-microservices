package com.javastart.account.entiry;

import lombok.*;

import javax.persistence.*;
import java.time.OffsetDateTime;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long accountId;
    private String name;
    private String email;
    private String phone;
    private OffsetDateTime offsetDateTime;

    @ElementCollection
    private List<Long> bills;

    public Account(String name, String email, String phone, OffsetDateTime offsetDateTime, List<Long> bills) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.offsetDateTime = offsetDateTime;
        this.bills = bills;
    }
}
