package lk.ijse.Crop_monitoring_system_backend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "equipment")
public class EquipmentEntity {
    @Id
    private String equipment_id;

    private String name;

    @Enumerated(EnumType.STRING)
    private String type;

    @Enumerated(EnumType.STRING)
    private String status;

    @ManyToOne
    @JoinColumn(name = "staff_id")
    private StaffEntity assigned_staff_details;

    @ManyToOne
    @JoinColumn(name = "field_id")
    private FieldEntity assigned_field_details;
}

