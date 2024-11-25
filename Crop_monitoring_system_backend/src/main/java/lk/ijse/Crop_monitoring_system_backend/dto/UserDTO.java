package lk.ijse.Crop_monitoring_system_backend.dto;


import lk.ijse.Crop_monitoring_system_backend.util.enums.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class UserDTO implements SuperDTO {
    private String id;
    private String email;
    private String password;
    private Role role;
    private String employee_code;
}
