package lk.ijse.Crop_monitoring_system_backend.Dao;


import lk.ijse.Crop_monitoring_system_backend.Entity.FieldEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FieldDao extends JpaRepository<FieldEntity,String> {
}
