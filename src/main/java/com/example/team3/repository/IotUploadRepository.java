package com.example.team3.repository;

import com.example.team3.Model.ELK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IotUploadRepository extends JpaRepository<ELK, Long> {
    ELK findFirstByOrderByElkTimeAsc();
}
