package com.example.Daviscollegeproj.repository;
import com.example.Daviscollegeproj.entity.Students;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentsRepository extends JpaRepository<Students,Integer> {
}
