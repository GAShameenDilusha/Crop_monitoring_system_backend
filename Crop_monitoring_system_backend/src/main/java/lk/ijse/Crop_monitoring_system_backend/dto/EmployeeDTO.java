package lk.ijse.Crop_monitoring_system_backend.dto;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lk.ijse.Crop_monitoring_system_backend.util.enums.Designation;
import lk.ijse.Crop_monitoring_system_backend.util.enums.Role;
import lk.ijse.Crop_monitoring_system_backend.util.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class EmployeeDTO implements SuperDTO{

    private String employee_code;
    private String name;
    private String profile_pic;
    private Gender gender;
    private String status;
    private Designation designation;
    private Role role;
    private Date dob;
    private Date joined_date;
    private String building_number;
    private String lane;
    private String city;
    private String state;
    private String postal_code;
    private String contact;
    private String email;
    private String guardian_name;
    private String guardian_contact;
    private String active_state;

    @JsonBackReference
    private FieldDTO branch;
}
