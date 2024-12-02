package lk.ijse.Crop_monitoring_system_backend.service;



import lk.ijse.Crop_monitoring_system_backend.Dto.impl.FieldDto;
import lk.ijse.Crop_monitoring_system_backend.Dto.impl.StaffDto;

import java.util.List;

public interface FieldService extends BaseService<FieldDto> {
    List<StaffDto> getStaffIdsByFieldId(String fieldId);

}
