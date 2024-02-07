package com.hikmatullo.app.job;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Job {
    private String title;
    private Long minSalary;
    private Long maxSalary;
}
