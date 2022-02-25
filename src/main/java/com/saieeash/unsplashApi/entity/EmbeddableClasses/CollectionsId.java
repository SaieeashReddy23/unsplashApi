package com.saieeash.unsplashApi.entity.EmbeddableClasses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class CollectionsId implements Serializable {
    private String photoId;
    private String collectionId;
}
