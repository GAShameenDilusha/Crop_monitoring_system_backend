package lk.ijse.Crop_monitoring_system_backend.dto.extra;

import lk.ijse.Crop_monitoring_system_backend.dto.SuperDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class EmployeeCountDTO implements SuperDTO {

    private int totalEmployeeCount;
    private int totalAdminEmployeeCount;
    private int totalUserEmployeeCount;

}
