package com.project.portfolio.controller.contact.response;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ContactResponse {

    int id;
    String name;
    String surname;
    String mailAddress;
    String message;
}
