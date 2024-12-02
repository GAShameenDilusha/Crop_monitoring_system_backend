package lk.ijse.Crop_monitoring_system_backend.service;



import lk.ijse.Crop_monitoring_system_backend.Dto.impl.FieldDto;
import lk.ijse.Crop_monitoring_system_backend.Dto.impl.StaffDto;


import java.util.List;
import java.util.Optional;

public interface StaffService extends BaseService<StaffDto> {

    Optional<StaffDto> findByEmail(String email);

    List<FieldDto> getFieldsOfStaffId(String staffId);
}
