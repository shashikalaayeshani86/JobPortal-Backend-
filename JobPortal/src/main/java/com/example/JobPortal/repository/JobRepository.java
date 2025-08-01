package com.example.JobPortal.repository;


import com.example.JobPortal.entity.Job;
import com.example.JobPortal.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobRepository extends JpaRepository<Job, Long> {

}
