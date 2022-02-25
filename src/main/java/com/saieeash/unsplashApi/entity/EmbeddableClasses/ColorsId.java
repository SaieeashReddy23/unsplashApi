package com.saieeash.unsplashApi.entity.EmbeddableClasses;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class ColorsId  implements Serializable {

    private String photoId;

    private String hex;

}
