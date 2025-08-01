package com.example.JobPortal.service;



import com.example.JobPortal.entity.Job;

import java.util.List;
import java.util.Optional;

public interface JobService {

    List<Job> getAllJobs();
    public void saveJobs(Job job);

    public void deleteJobById(long id);

    Optional<Job> getJobById(Long id);
}
