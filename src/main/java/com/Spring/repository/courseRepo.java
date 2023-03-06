package com.Spring.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.Spring.models.course;

@Repository
@EnableJpaRepositories
public interface courseRepo extends JpaRepository<course, Integer>
{

}




