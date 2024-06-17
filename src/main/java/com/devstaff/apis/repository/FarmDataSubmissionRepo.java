package com.devstaff.apis.repository;

import com.devstaff.apis.entity.HarvestSubmission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FarmDataSubmissionRepo extends JpaRepository<HarvestSubmission, Long> {
}
