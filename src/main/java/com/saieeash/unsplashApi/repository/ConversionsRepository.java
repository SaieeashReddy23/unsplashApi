package com.saieeash.unsplashApi.repository;

import com.saieeash.unsplashApi.entity.Conversions;
import com.saieeash.unsplashApi.entity.EmbeddableClasses.ConversionId;
import com.saieeash.unsplashApi.entity.Keywords;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ConversionsRepository extends JpaRepository<Conversions, ConversionId> {


    @Query(value = "select * from unsplash_conversions limit 100", nativeQuery = true)
    List<Conversions> findingUpto();
}
