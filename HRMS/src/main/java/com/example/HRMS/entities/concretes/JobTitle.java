package com.example.HRMS.entities.concretes;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "job_titles")
public class JobTitle {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "title")
    private String jobTitle;

    public JobTitle() {
    }

    public JobTitle(int id, String jobTitle) {
        this.id = id;
        this.jobTitle = jobTitle;
    }
}
