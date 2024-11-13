package lk.ijse.Crop_monitoring_system_backend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "vehicle")
public class VehicleEntity {
    @Id
    private String vehicle_code;

    private String license_plate_number;

    private String vehicle_category;

    private String fuel_type;

    private String status;

    @ManyToOne
    @JoinColumn(name = "staff_id")
    private StaffEntity allocated_staff_member_details;

    private String remarks;
}