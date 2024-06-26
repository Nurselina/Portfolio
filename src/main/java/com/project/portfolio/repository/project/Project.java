package com.project.portfolio.repository.project;

import com.project.portfolio.core.Base;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Projects")

public class Project extends Base {

    @Column(name = "title")
    private String title;

    @Column(name = "detail")
    private String detail;

    @Column(name = "project_date")
    private LocalDate projectDate;

    @Column(name = "skill_id")
    private int skill;

    @Column(name = "live_site_link")
    private String liveSiteLink;

    @Column(name = "github_link")
    private String githubLink;


}
