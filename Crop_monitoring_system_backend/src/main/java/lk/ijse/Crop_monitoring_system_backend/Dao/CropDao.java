package lk.ijse.Crop_monitoring_system_backend.Dao;


import lk.ijse.Crop_monitoring_system_backend.Entity.CropEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CropDao extends JpaRepository<CropEntity,String> {
}
