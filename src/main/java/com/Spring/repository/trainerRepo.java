package com.Spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.Spring.models.trainer;

@Repository
@EnableJpaRepositories
public interface trainerRepo extends JpaRepository<trainer, Integer>
{

}
