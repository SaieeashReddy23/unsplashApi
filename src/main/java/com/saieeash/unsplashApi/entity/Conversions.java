package com.saieeash.unsplashApi.entity;


import com.saieeash.unsplashApi.entity.EmbeddableClasses.ConversionId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "unsplash_conversions")
@IdClass(ConversionId.class)
public class Conversions {

    @Id
    @Column(name = "converted_at",nullable = false)
    private LocalDate convAt;

    @Id
    @Column(name = "conversion_type",nullable = false)
    private String convType;

    @Column(name = "keyword")
    private String keyword;

    @Column(name = "photo_id")
    private String photoId;

    @Column(name = "anonymous_user_id")
    private String anonUserId;

    @Column(name = "conversion_country")
    private String convCountry;

}
