package com.saieeash.unsplashApi.repository;

import com.saieeash.unsplashApi.entity.EmbeddableClasses.KeywordId;
import com.saieeash.unsplashApi.entity.Keywords;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface KeywordsRepository extends JpaRepository<Keywords, KeywordId> {

    @Query(value = "select * from unsplash_keywords limit 100", nativeQuery = true)
    List<Keywords> findingUpto();
}
