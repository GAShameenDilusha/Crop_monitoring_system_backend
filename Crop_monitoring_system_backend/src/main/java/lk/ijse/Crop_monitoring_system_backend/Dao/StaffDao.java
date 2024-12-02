package lk.ijse.Crop_monitoring_system_backend.Dao;



import lk.ijse.Crop_monitoring_system_backend.Entity.StaffEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StaffDao extends JpaRepository<StaffEntity,String> {
    Optional<StaffEntity> findByEmail(String email);
}
