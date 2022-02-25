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
public class KeywordId implements Serializable {
    private String id;
    private String keyword;
}
