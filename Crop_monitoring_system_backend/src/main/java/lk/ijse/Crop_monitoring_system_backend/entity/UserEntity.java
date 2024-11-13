package lk.ijse.Crop_monitoring_system_backend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "user")
public class UserEntity {
    @Id
    private String email;

    private String password;

    @Enumerated(EnumType.STRING)
    private lk.ijse.Crop_monitoring_system_backend.util.Role role;
}

