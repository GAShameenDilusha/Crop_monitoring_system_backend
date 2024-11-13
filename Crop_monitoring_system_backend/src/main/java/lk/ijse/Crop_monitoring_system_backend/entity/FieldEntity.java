package lk.ijse.Crop_monitoring_system_backend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.awt.*;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "field")
public class FieldEntity {
    @Id
    private String field_code;

    private String field_name;

    @Embedded
    private Point field_location;

    private Double extent_size_of_the_Field;

    @ElementCollection
    @CollectionTable(name = "field_crops", joinColumns = @JoinColumn(name = "field_code"))
    @Column(name = "crop")
    private List<String> crops;

    @ElementCollection
    @CollectionTable(name = "field_staff", joinColumns = @JoinColumn(name = "field_code"))
    @Column(name = "staff_member")
    private List<String> staff;

    @Column(columnDefinition = "TEXT")
    private String field_image1;

    @Column(columnDefinition = "TEXT")
    private String field_image2;




    // Additional Point class for GPS coordinates
    @Embeddable
    class Point {
        private Double latitude;
        private Double longitude;

        // Getters and setters
        public Double getLatitude() {
            return latitude;
        }

        public void setLatitude(Double latitude) {
            this.latitude = latitude;
        }

        public Double getLongitude() {
            return longitude;
        }

        public void setLongitude(Double longitude) {
            this.longitude = longitude;
        }
    }
}