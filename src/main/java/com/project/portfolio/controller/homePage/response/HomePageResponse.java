package com.project.portfolio.controller.homePage.response;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class HomePageResponse {

    int id;
    String detail;
    int socialMediaId;
}
