package com.bridgelabz.bookstorerabbitmq.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class LoginStatus {

    private Login login ;
    private String status;
    private String message;
}
