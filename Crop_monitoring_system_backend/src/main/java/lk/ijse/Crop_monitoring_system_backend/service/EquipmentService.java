package lk.ijse.Crop_monitoring_system_backend.service;



import lk.ijse.Crop_monitoring_system_backend.Dto.impl.EquipmentDto;

import java.util.List;

public interface EquipmentService extends BaseService<EquipmentDto> {
    List<EquipmentDto> getEquipmentByStaffId(String staffId);
    List<EquipmentDto> getEquipmentByFieldId(String fieldId);

}
