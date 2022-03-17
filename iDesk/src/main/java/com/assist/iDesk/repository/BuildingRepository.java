package com.assist.iDesk.repository;

import com.assist.iDesk.entity.Building;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface BuildingRepository extends JpaRepository<Building,Long> {
Building findByBuildingName(String buildingName);
}
