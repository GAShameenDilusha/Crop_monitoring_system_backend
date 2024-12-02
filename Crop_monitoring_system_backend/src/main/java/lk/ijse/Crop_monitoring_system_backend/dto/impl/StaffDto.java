package lk.ijse.Crop_monitoring_system_backend.Dto.impl;


import lk.ijse.Crop_monitoring_system_backend.Dto.StaffStatus;
import lk.ijse.Crop_monitoring_system_backend.Entity.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StaffDto implements StaffStatus {
    private String staffId;
    private String firstName;
    private String lastName;
    private String gender;
    private String designation;
    private String email;
    private Date dob;
    private String address;
    private String contact;
    private Date joinDate;
    private Role role;
   private List<String> fieldIds;
}
