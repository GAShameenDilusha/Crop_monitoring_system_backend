package lk.ijse.Crop_monitoring_system_backend.service;


import lk.ijse.Crop_monitoring_system_backend.dto.FieldDTO;

public interface FieldService extends SuperService<String, FieldDTO>{
    String getFieldCode();


    String getFieldName(String fieldCode);
}
