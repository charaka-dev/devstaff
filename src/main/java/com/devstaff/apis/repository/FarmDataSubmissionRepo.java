package com.devstaff.apis.repository;

import com.devstaff.apis.entity.HarvestSubmission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Repository
public interface FarmDataSubmissionRepo extends JpaRepository<HarvestSubmission, Long> {

    @Query("SELECT e FROM HarvestSubmission e WHERE e.submitId = :submitID")
    Optional<HarvestSubmission> findBySubmitId(String submitID);
}
