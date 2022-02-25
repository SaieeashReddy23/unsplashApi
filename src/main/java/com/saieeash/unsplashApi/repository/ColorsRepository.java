package com.saieeash.unsplashApi.repository;

import com.saieeash.unsplashApi.entity.Colors;
import com.saieeash.unsplashApi.entity.EmbeddableClasses.ColorsId;
import com.saieeash.unsplashApi.entity.Photos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ColorsRepository extends JpaRepository<Colors, ColorsId> {

    @Query(value = "select * from unsplash_colors limit 100", nativeQuery = true)
    List<Colors> findingUpto();
}
