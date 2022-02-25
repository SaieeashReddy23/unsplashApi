package com.saieeash.unsplashApi.repository;

import com.saieeash.unsplashApi.entity.Students;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentsRepository extends JpaRepository<Students,Integer> {
}
