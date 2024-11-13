package lk.ijse.Crop_monitoring_system_backend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.awt.*;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class FieldDTO {
    private String fieldCode;
    private String fieldName;
    private Double latitude;
    private Double longitude;
    private Double extentSize;
    private List<String> crops;
    private List<String> staff;
    private String fieldImage1;
    private String fieldImage2;
}



/*package lk.ijse.Crop_monitoring_system_backend.dto;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class FieldDTO {
    private String field_code;
    private String field_name;
    private String field_manager;
    private String address;
    private String contact;
    private Integer no_of_employee;
    @JsonManagedReference
    private List<EmployeeDTO> employees;
}*/
