package com.saieeash.unsplashApi.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.time.LocalDate;

public class PhotosDTO {

    private String photoUrl;
    private String imageUrl;
    private LocalDate submittedAt;
    private Integer width;
    private Integer height;
    private String description;
    private String photographerUserName;
    private String photographerFirstName;
    private String photographerLastName;
    private String cameraMake;
    private String cameraModel;
    private String locationName;
    private Double photoLocationLatitude;
    private Double photoLocationLongitude;
    private String photoLocationCountry;
    private String photoLocationCity;
    private Integer views;
    private Integer downloads;
    private String aiDesc;


    public PhotosDTO(String photoUrl, String imageUrl, LocalDate submittedAt, Integer width, Integer height, String description, String photographerUserName, String photographerFirstName, String photographerLastName, String cameraMake, String cameraModel, String locationName, Double photoLocationLatitude, Double photoLocationLongitude, String photoLocationCountry, String photoLocationCity, Integer views, Integer downloads, String aiDesc) {
        this.photoUrl = photoUrl;
        this.imageUrl = imageUrl;
        this.submittedAt = submittedAt;
        this.width = width;
        this.height = height;
        this.description = description;
        this.photographerUserName = photographerUserName;
        this.photographerFirstName = photographerFirstName;
        this.photographerLastName = photographerLastName;
        this.cameraMake = cameraMake;
        this.cameraModel = cameraModel;
        this.locationName = locationName;
        this.photoLocationLatitude = photoLocationLatitude;
        this.photoLocationLongitude = photoLocationLongitude;
        this.photoLocationCountry = photoLocationCountry;
        this.photoLocationCity = photoLocationCity;
        this.views = views;
        this.downloads = downloads;
        this.aiDesc = aiDesc;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public LocalDate getSubmittedAt() {
        return submittedAt;
    }

    public void setSubmittedAt(LocalDate submittedAt) {
        this.submittedAt = submittedAt;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPhotographerUserName() {
        return photographerUserName;
    }

    public void setPhotographerUserName(String photographerUserName) {
        this.photographerUserName = photographerUserName;
    }

    public String getPhotographerFirstName() {
        return photographerFirstName;
    }

    public void setPhotographerFirstName(String photographerFirstName) {
        this.photographerFirstName = photographerFirstName;
    }

    public String getPhotographerLastName() {
        return photographerLastName;
    }

    public void setPhotographerLastName(String photographerLastName) {
        this.photographerLastName = photographerLastName;
    }

    public String getCameraMake() {
        return cameraMake;
    }

    public void setCameraMake(String cameraMake) {
        this.cameraMake = cameraMake;
    }

    public String getCameraModel() {
        return cameraModel;
    }

    public void setCameraModel(String cameraModel) {
        this.cameraModel = cameraModel;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public Double getPhotoLocationLatitude() {
        return photoLocationLatitude;
    }

    public void setPhotoLocationLatitude(Double photoLocationLatitude) {
        this.photoLocationLatitude = photoLocationLatitude;
    }

    public Double getPhotoLocationLongitude() {
        return photoLocationLongitude;
    }

    public void setPhotoLocationLongitude(Double photoLocationLongitude) {
        this.photoLocationLongitude = photoLocationLongitude;
    }

    public String getPhotoLocationCountry() {
        return photoLocationCountry;
    }

    public void setPhotoLocationCountry(String photoLocationCountry) {
        this.photoLocationCountry = photoLocationCountry;
    }

    public String getPhotoLocationCity() {
        return photoLocationCity;
    }

    public void setPhotoLocationCity(String photoLocationCity) {
        this.photoLocationCity = photoLocationCity;
    }

    public Integer getViews() {
        return views;
    }

    public void setViews(Integer views) {
        this.views = views;
    }

    public Integer getDownloads() {
        return downloads;
    }

    public void setDownloads(Integer downloads) {
        this.downloads = downloads;
    }

    public String getAiDesc() {
        return aiDesc;
    }

    public void setAiDesc(String aiDesc) {
        this.aiDesc = aiDesc;
    }
}
