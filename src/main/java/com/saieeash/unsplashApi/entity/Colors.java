package com.saieeash.unsplashApi.entity;


import com.saieeash.unsplashApi.entity.EmbeddableClasses.ColorsId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "unsplash_colors")
@IdClass(ColorsId.class)
public class Colors {
    @Id
    @Column(name = "photo_id",nullable = false)
    private String photoId;

    @Id
    @Column(name = "hex" , nullable = false)
    private String hex;

    private Integer red;
    private Integer green;
    private Integer blue;
    private String keyword;

    @Column(name = "ai_coverage")
    private Double aiCoverage;

    @Column(name = "ai_score")
    private Double aiScore;
}
