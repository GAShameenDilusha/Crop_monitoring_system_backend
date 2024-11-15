package lk.ijse.Crop_monitoring_system_backend.service;



import lk.ijse.Crop_monitoring_system_backend.dto.EmployeeDTO;
import lk.ijse.Crop_monitoring_system_backend.dto.FieldDTO;
import lk.ijse.Crop_monitoring_system_backend.dto.extra.EmployeeCountDTO;
import lk.ijse.Crop_monitoring_system_backend.dto.extra.EmployeeDesigCountsDTO;
import lk.ijse.Crop_monitoring_system_backend.util.enums.Designation;

import java.util.List;

public interface EmployeeService extends SuperService<String, EmployeeDTO> {
    FieldDTO getField(String employeeCode);

    String getEmployeeCode();

    List<Designation> getDesignations();

    EmployeeCountDTO getEmployeeCount();

    EmployeeDesigCountsDTO getEmployeeCountByDesignation();

    String getFieldCodeByEmployeeCode(String cashierName);

    List<String> getEmployeeCountByField();
}
