package com.assist.iDesk.repository;

import com.assist.iDesk.entity.Office;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OfficeRepository extends JpaRepository<Office,Long> {
String findByOfficeName(String officeName);

}
