package lk.ijse.Crop_monitoring_system_backend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "monitoring_log")
public class MonitoringLogEntity {
    @Id
    private String log_code;

    @Temporal(TemporalType.DATE)
    private Date log_date;

    private String log_details;

    @Column(columnDefinition = "TEXT")
    private String observed_image;

    @ElementCollection
    @CollectionTable(name = "monitoring_log_fields", joinColumns = @JoinColumn(name = "log_code"))
    @Column(name = "field")
    private List<String> field;

    @ElementCollection
    @CollectionTable(name = "monitoring_log_crops", joinColumns = @JoinColumn(name = "log_code"))
    @Column(name = "crop")
    private List<String> crop;

    @ElementCollection
    @CollectionTable(name = "monitoring_log_staff", joinColumns = @JoinColumn(name = "log_code"))
    @Column(name = "staff")
    private List<String> staff;
}