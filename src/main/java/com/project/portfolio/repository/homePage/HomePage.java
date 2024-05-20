package com.project.portfolio.repository.homePage;

import com.project.portfolio.core.Base;
import com.project.portfolio.repository.socialMedia.SocialMedia;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "HomePage")
public class HomePage extends Base {

    @Column(name = "detail")
    private String detail;

    @ManyToOne
    @JoinColumn(name = "social_media_id")
    private SocialMedia socialMedia;

}
