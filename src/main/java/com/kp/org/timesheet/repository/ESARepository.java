package com.kp.org.timesheet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kp.org.timesheet.entity.ESAData;

@Repository
public interface ESARepository extends JpaRepository<ESAData, Long>{

}
