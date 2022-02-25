package com.saieeash.unsplashApi.repository;

import com.saieeash.unsplashApi.entity.Collections;
import com.saieeash.unsplashApi.entity.Colors;
import com.saieeash.unsplashApi.entity.EmbeddableClasses.CollectionsId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CollectionsRepository extends JpaRepository<Collections, CollectionsId> {

    @Query(value = "select * from unsplash_collections limit 100", nativeQuery = true)
    List<Collections> findingUpto();
}
