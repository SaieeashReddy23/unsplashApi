package com.saieeash.unsplashApi.entity;

import com.saieeash.unsplashApi.entity.EmbeddableClasses.KeywordId;
import lombok.*;

import javax.persistence.*;

@Entity
@Data
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@IdClass(KeywordId.class)
@Table(name = "unsplash_keywords")
public class Keywords {

    @Id
    @Column(name ="photo_id",nullable = false )
    private String id;

    @Id
    @Column(name ="keyword",nullable = false)
    private String keyword;

    @Column(name = "ai_service_1_confidence")
    private Double confidence1;

    @Column(name = "ai_service_2_confidence")
    private Double confidence2;

    @Column(name ="suggested_by_user" )
    private Boolean suggested;

}
