package com.kp.org.timesheet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kp.org.timesheet.entity.RPMData;

@Repository
public interface RPMRepository extends JpaRepository<RPMData, Long>{

}
