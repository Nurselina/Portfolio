package com.project.portfolio.controller.certificate.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public class UpdateCertificateRequest {

    @NotNull
    private int id;

    @NotBlank
    private String name;

    @NotBlank
    private String organisationName;

    @NotNull
    private LocalDate givenDate;

    @NotBlank
    private String certificateSiteLink;
}
