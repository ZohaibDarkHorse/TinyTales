package com.tinyTales.project.TinyTalesProjectAPIs.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tinyTales.project.TinyTalesProjectAPIs.entity.RegisterTinyTalesClient;

@Repository
public interface RegisterTinyTalesClientRepository extends JpaRepository<RegisterTinyTalesClient, Long>{

	List<RegisterTinyTalesClient> findByEmail(String email);
}
