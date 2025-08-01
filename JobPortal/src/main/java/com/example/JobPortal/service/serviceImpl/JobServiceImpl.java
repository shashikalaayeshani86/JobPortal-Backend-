package com.example.JobPortal.service.serviceImpl;

import com.example.JobPortal.entity.Job;
import com.example.JobPortal.repository.JobRepository;
import com.example.JobPortal.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobServiceImpl implements JobService {

    @Autowired
    private JobRepository jobRepository;
    @Override
    public List<Job> getAllJobs() {
        return jobRepository.findAll();
    }

    @Override
    public void saveJobs(Job job) {
        jobRepository.save(job);
    }

    @Override
    public void deleteJobById(long id) {
        jobRepository.deleteById(id);
    }

    @Override
    public Optional<Job> getJobById(Long id) {
        return jobRepository.findById(id);
    }
}
