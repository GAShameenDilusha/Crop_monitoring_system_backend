package lk.ijse.Crop_monitoring_system_backend.Dao;


import lk.ijse.Crop_monitoring_system_backend.Entity.LogEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LogDao extends JpaRepository<LogEntity,String> {
}
