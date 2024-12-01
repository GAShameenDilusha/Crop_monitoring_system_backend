package lk.ijse.Crop_monitoring_system_backend.Dao;



import lk.ijse.Crop_monitoring_system_backend.Entity.EquipmentEntity;
import lk.ijse.Crop_monitoring_system_backend.Entity.FieldEntity;
import lk.ijse.Crop_monitoring_system_backend.Entity.StaffEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EquipmentDao extends JpaRepository<EquipmentEntity,String> {
    List<EquipmentEntity> findByStaff(StaffEntity staff);
    List<EquipmentEntity> findByField(FieldEntity field);

}
