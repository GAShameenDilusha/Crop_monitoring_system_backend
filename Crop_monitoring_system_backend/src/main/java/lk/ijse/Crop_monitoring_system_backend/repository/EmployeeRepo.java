/*
package lk.ijse.Crop_monitoring_system_backend.repository;


import lk.ijse.Crop_monitoring_system_backend.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepo extends JpaRepository<EmployeeEntity, String> {
    @Query(value = "SELECT employee_code FROM employee ORDER BY employee_code DESC LIMIT 1", nativeQuery = true)
    String getEmployeeCode();

    @Modifying
    @Query(value = "UPDATE employee SET active_state = ?1 WHERE employee_code = ?2", nativeQuery = true)
    void changeActiveState(String deactivate, String employeeCode);

    @Override
    @Query(value = "SELECT * FROM employee WHERE active_state = 'ACTIVE'", nativeQuery = true)
    List<EmployeeEntity> findAll();

    @Query(value = "SELECT branch_code FROM employee WHERE employee_code = ?1", nativeQuery = true)
    String getBranchCodeByEmployeeCode(String cashierName);
}
*/
package lk.ijse.Crop_monitoring_system_backend.repository;

import lk.ijse.Crop_monitoring_system_backend.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepo extends JpaRepository<EmployeeEntity, String> {
    @Query(value = "SELECT id FROM staff ORDER BY id DESC LIMIT 1", nativeQuery = true)
    String getEmployeeCode();

    @Query(value = "SELECT DISTINCT designation FROM staff", nativeQuery = true)
    List<String> findDistinctDesignations();

    @Query(value = "SELECT field FROM staff_fields WHERE staff_id = ?1", nativeQuery = true)
    List<String> findFieldsByEmployeeId(String employeeId);

    @Query(value = "SELECT vehicle FROM staff_vehicles WHERE staff_id = ?1", nativeQuery = true)
    List<String> findVehiclesByEmployeeId(String employeeId);
}