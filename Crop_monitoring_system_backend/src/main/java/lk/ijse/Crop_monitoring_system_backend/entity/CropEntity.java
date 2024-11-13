package lk.ijse.Crop_monitoring_system_backend.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "crop")
public class CropEntity {
    @Id
    private String crop_code;

    private String crop_common_name;

    private String crop_scientific_name;

    @Column(columnDefinition = "TEXT")
    private String crop_image;

    private String category;

    private String crop_season;

    @ManyToOne
    @JoinColumn(name = "field_code")
    private FieldEntity field;
}