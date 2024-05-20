package com.project.portfolio.controller.project.response;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProjectResponse {

    int id;
    String title;
    String detail;
    LocalDate projectDate;
    int skillId;
    String liveSiteLink;
    String githubLink;

}
