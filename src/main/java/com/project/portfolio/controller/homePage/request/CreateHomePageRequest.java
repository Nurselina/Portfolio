package com.project.portfolio.controller.homePage.request;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreateHomePageRequest {

    @NotBlank
    private String detail;

    @NotNull
    private int socialMediaId;


}
