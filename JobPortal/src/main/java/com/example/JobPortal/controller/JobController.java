package com.example.JobPortal.controller;

import com.example.JobPortal.entity.Job;
import com.example.JobPortal.repository.JobRepository;
import com.example.JobPortal.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/job")
@CrossOrigin
public class JobController {

    @Autowired
    private JobService jobService;

    @GetMapping("/get")
    public List<Job> getAllJobs(){
        List<Job> jobs = jobService.getAllJobs();
        return jobs;
    }

    @GetMapping("get/{id}")
    public Job getJobById(@PathVariable long id){
        return jobService.getJobById(id).orElse(null);
    }

    @PostMapping("/save")
    public void saveJobs(@RequestBody Job job){
        jobService.saveJobs(job);
    }

    @DeleteMapping("/delete")
    public void deleteJobById(@RequestParam Long id){
        jobService.deleteJobById(id);
    }
}