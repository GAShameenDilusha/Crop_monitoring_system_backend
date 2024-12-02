package lk.ijse.Crop_monitoring_system_backend.service;



import lk.ijse.Crop_monitoring_system_backend.Dto.impl.LogDto;

import java.util.Map;

public interface LogService extends BaseService<LogDto> {
    Map<String, Object> getRelatedEntitiesAsDtos(String logId);
}
