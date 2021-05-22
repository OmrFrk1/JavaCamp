package com.example.HRMS.dataAccess.abstracts;

import com.example.HRMS.entities.concretes.JobTitle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobTitleDao extends JpaRepository<JobTitle,Integer> {
}
