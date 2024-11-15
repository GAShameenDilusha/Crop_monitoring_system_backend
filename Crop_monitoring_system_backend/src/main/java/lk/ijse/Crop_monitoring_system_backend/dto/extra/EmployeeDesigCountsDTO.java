package lk.ijse.Crop_monitoring_system_backend.dto.extra;

import lk.ijse.Crop_monitoring_system_backend.dto.SuperDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class EmployeeDesigCountsDTO implements SuperDTO {
    private int manager;
    private int stockKeeper;
    private int delivery;
    private int cashier;
    private int cleaner;
    private int securityGuard;

}
