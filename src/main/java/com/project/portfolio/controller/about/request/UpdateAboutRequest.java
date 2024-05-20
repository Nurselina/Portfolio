package com.project.portfolio.controller.about.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UpdateAboutRequest {

    @NotNull
    private int id;

    @NotBlank
    private String detail;

}
