package com.hikmatullo.app.job;


import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class JobController {
    private final JobRepository jobRepository;

    @GetMapping
    public List<Job> findAll() {
        return jobRepository.findAll();
    }
}
