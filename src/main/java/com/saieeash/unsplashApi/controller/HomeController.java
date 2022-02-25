package com.saieeash.unsplashApi.controller;


import com.saieeash.unsplashApi.entity.*;
import com.saieeash.unsplashApi.model.KeywordCountDTO;
import com.saieeash.unsplashApi.model.PhotosDTO;
import com.saieeash.unsplashApi.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class HomeController {

    @Autowired
    private KeywordsRepository keyRepo;

    @Autowired
    private ConversionsRepository convRepo;

    @Autowired
    private CollectionsRepository colRepo;

    @Autowired
    private PhotosRepository photosRepo;

    @Autowired
    private ColorsRepository colorsRepo;

    @Autowired
    private StudentsRepository stdRepo;


    @RequestMapping("/getKeywords")
    public List<Keywords> getAllKeywords(){
        return keyRepo.findingUpto();
    }

    @RequestMapping("/getConversions")
    public List<Conversions> getAllConversions(){
        return convRepo.findingUpto();
    }

    @RequestMapping("/getCollections")
    public List<Collections> getAllCollections(){

        return colRepo.findingUpto();
    }

    @RequestMapping("/getColors")
    public List<Colors> getAllColors(){

        return colorsRepo.findingUpto();
    }

    @RequestMapping("/getAllPhotos")
    public List<Photos> getAllPhotos(){

        return photosRepo.findingUpto();
    }


    @RequestMapping("/getKeywordCount")
    public List<KeywordCountDTO> getKeywordCount() {
        return photosRepo.getKeyWordCount();
    }


    @RequestMapping("/getPhotos/{keyword}/{page}/{size}")
    public Page<PhotosDTO> getPhotos(@PathVariable("keyword") String keyword, @PathVariable int page, @PathVariable int size) {
        Pageable paging =  PageRequest.of(page,size);
        return  photosRepo.getPhotos(keyword,paging);
    }

    @RequestMapping("/getStudents")
    public List<Students> getStudents(){

        return stdRepo.findAll();
    }




}

