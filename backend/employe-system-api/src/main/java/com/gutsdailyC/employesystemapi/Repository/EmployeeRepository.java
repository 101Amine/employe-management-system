package com.gutsdailyC.employesystemapi.Repository;

import com.gutsdailyC.employesystemapi.Entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {


}
