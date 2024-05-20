package com.project.portfolio.controller.experience.response;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ExperienceResponse {

    int id;
    String departmentTitle;
    String workplace;
    String detail;
    LocalDate startDate;
    LocalDate endDate;
}
