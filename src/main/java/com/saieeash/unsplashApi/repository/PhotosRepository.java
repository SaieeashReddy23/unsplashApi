package com.saieeash.unsplashApi.repository;

import com.saieeash.unsplashApi.entity.Photos;

import com.saieeash.unsplashApi.model.KeywordCountDTO;
import com.saieeash.unsplashApi.model.PhotosDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface PhotosRepository extends JpaRepository<Photos,String> {

    @Query(value = "select * from unsplash_photos limit 100", nativeQuery = true)
    List<Photos> findingUpto();

    @Query("select new com.saieeash.unsplashApi.model.KeywordCountDTO( b.keyword,count(*) as c) from Photos as a " +
            "left join Keywords as b on a.photoId = b.id  group by b.keyword order by c desc")
    List<KeywordCountDTO> getKeyWordCount();

    @Query("select new com.saieeash.unsplashApi.model.PhotosDTO(a.photoUrl,a.imageUrl,a.submittedAt,"+
            "a.width,a.height,a.description,a.photographerUserName,a.photographerFirstName,a.photographerLastName,"+
            "a.cameraMake,a.cameraModel,a.locationName,a.photoLocationLatitude,a.photoLocationLongitude,a.photoLocationCountry,"+
            "a.photoLocationCity,a.views,a.downloads,a.aiDesc) from Photos as a " +
            "left join Keywords as b on a.photoId = b.id  where (b.keyword=:keyword and b.confidence1 is not null"+
            " and b.confidence2 is not null) order by (b.confidence1,b.confidence2) desc")
    Page<PhotosDTO> getPhotos(String keyword, Pageable paging);





}
