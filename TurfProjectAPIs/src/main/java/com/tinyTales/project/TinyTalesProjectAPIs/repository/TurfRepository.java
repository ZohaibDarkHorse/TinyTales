package com.tinyTales.project.TinyTalesProjectAPIs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tinyTales.project.TinyTalesProjectAPIs.entity.Turf;

@Repository
public interface TurfRepository extends JpaRepository<Turf, Long> {

}
