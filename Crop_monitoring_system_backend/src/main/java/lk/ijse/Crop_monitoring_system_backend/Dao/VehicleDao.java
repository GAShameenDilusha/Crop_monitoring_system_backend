package lk.ijse.Crop_monitoring_system_backend.Dao;



import lk.ijse.Crop_monitoring_system_backend.Entity.StaffEntity;
import lk.ijse.Crop_monitoring_system_backend.Entity.VehicleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VehicleDao extends JpaRepository<VehicleEntity,String> {
    // Custom method to find vehicles by Staff entity
    List<VehicleEntity> findByStaff(StaffEntity staff);
}
