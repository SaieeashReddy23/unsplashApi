package com.saieeash.unsplashApi.entity;




////photod
//photo_id String
//        photo_url String
//        photo_image_url String
//        photo_submitted_at Date
//        photo_featured boolean
//        photo_width Integer
//        photo_height Integer
//        photo_aspect_ratio double
//        photo_description String
//        photographer_username String


//        photographer_first_name String
//        photographer_last_name String
//        exif_camera_make String
//        exif_camera_model String
//        exif_iso Integer
//        exif_aperture_value String
//        exif_focal_length String
//        exif_exposure_time String
//        photo_location_Name String

//photo_location_latitude
//        photo_location_longitude
//        photo_location_country
//        photo_location_city
//        stats_views
//        stats_downloads
//        ai_description
//
//

//        ai_primary_landmark_name String
//        ai_primary_landmark_latitude Doble
//        ai_primary_landmark_longitude Double
//        ai_primary_landmark_confidence String
//        blur_hash  String



//





import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.Table;
import java.time.LocalDate;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "unsplash_photos")
public class Photos {

    @Id
    @Column(name = "photo_id")
    private String photoId;

    @Column(name = "photo_url")
    private String photoUrl;

    @Column(name = "photo_image_url")
    private String imageUrl;

    @Column(name = "photo_submitted_at")
    private LocalDate submittedAt;

    @Column(name = "photo_featured")
    private Boolean featured;

    @Column(name = "photo_width")
    private Integer width;

    @Column(name = "photo_height")
    private Integer height;

    @Column(name = "photo_aspect_ratio")
    private Double aspectRatio;

    @Column(name = "photo_description")
    private String description;

    @Column(name = "photographer_username")
    private String photographerUserName;




    @Column(name = "photographer_first_name")
    private String photographerFirstName;

    @Column(name = "photographer_last_name")
    private String photographerLastName;

    @Column(name = "exif_camera_make")
    private String cameraMake;

    @Column(name = "exif_camera_model")
    private String cameraModel;

    @Column(name = "exif_iso")
    private Integer iso;

    @Column(name = "exif_aperture_value")
    private String aperture;

    @Column(name = "exif_focal_length")
    private String focalLength;

    @Column(name = "exif_exposure_time")
    private String exposureTime;

    @Column(name = "photo_location_Name")
    private String locationName;




    @Column(name = "photo_location_latitude")
    private Double photoLocationLatitude;

    @Column(name = "photo_location_longitude")
    private Double photoLocationLongitude;

    @Column(name = "photo_location_country")
    private String photoLocationCountry;

    @Column(name = "photo_location_city")
    private String photoLocationCity;


    @Column(name = "stats_views")
    private Integer views;

    @Column(name = "stats_downloads")
    private Integer downloads;

    @Column(name = "ai_description")
    private String aiDesc;


    @Column(name = "ai_primary_landmark_name")
    private String aiLandmarkName;

    @Column(name = "ai_primary_landmark_latitude")
    private Double aiLandmarkLatitide;

    @Column(name = "ai_primary_landmark_longitude")
    private Double aiLandmarkLongitude;

    @Column(name = "ai_primary_landmark_confidence")
    private String aiLandmarkConfidence;

    @Column(name = "blur_hash")
    private String blurHash;


}






