package lk.ijse.Crop_monitoring_system_backend.service;



import lk.ijse.Crop_monitoring_system_backend.Dto.impl.VehicleDto;

import java.util.List;

public interface VehicleService extends BaseService<VehicleDto> {
    List<VehicleDto> getVehiclesByStaffId(String staffId);
}
