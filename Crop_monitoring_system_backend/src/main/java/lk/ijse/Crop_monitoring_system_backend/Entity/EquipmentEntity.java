package lk.ijse.Crop_monitoring_system_backend.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "equipment")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class EquipmentEntity {
    @Id
    private String equipmentId;
    private String type;
    private String name;
    private String status;
    private String remarks;

    @ManyToOne
    @JoinColumn(name = "field_id")
    private FieldEntity field;

    @ManyToOne
    @JoinColumn(name = "staff_id")
    private StaffEntity staff;
}
