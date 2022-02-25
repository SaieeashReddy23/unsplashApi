package com.saieeash.unsplashApi.entity;


////collections
//photo_id String;
//        collection_id String;
//        collection_title String
//        photo_collected_at LoacalData

import com.saieeash.unsplashApi.entity.EmbeddableClasses.CollectionsId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "unsplash_collections")
@IdClass(CollectionsId.class)
public class Collections {

    @Id
    @Column(name = "photo_id",nullable = false)
    private String photoId;

    @Id
    @Column(name = "collection_id",nullable = false)
    private String collectionId;

    @Column(name = "collection_title")
    private String collectionTitle;

    @Column(name = "photo_collected_at")
    private LocalDate photoCollected;
}
