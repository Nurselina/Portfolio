package com.project.portfolio.controller.certificate.response;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class CertificateResponse {
    int id;
    String name;
    String organisationName;
    LocalDate givenDate;
    String certificateSiteLink;

}
