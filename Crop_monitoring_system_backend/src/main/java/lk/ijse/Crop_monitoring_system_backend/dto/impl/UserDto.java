package lk.ijse.Crop_monitoring_system_backend.Dto.impl;


import lk.ijse.Crop_monitoring_system_backend.Dto.StaffStatus;
import lk.ijse.Crop_monitoring_system_backend.Entity.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserDto implements StaffStatus {
    private String id;
    private String email;
    private String password;
    private Role role;
    private String staffId;

}
