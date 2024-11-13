package lk.ijse.Crop_monitoring_system_backend.repository;

import lk.ijse.Crop_monitoring_system_backend.entity.FieldEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface FieldRepo extends JpaRepository<FieldEntity,String> {

    @Query(value = "SELECT field_code FROM field ORDER BY field_code DESC LIMIT 1", nativeQuery = true)
    String getFieldCode();

    @Query(value = "SELECT field_name FROM field WHERE field_code = ?1", nativeQuery = true)
    String getFieldName(String fieldCode);
}
