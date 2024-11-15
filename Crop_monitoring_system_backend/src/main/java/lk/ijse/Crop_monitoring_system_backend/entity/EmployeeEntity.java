package lk.ijse.Crop_monitoring_system_backend.entity;

import jakarta.persistence.*;
import lk.ijse.Crop_monitoring_system_backend.util.enums.Gender;
import lk.ijse.Crop_monitoring_system_backend.util.enums.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "staff")
public class EmployeeEntity {
    @Id
    private String id;

    private String first_name;

    private String last_name;

    private String designation;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Temporal(TemporalType.DATE)
    private Date joined_date;

    @Temporal(TemporalType.DATE)
    private Date DOB;

    private String address_line_01;

    private String address_line_02;

    private String address_line_03;

    private String address_line_04;

    private String address_line_05;

    private String contact_no;

    private String email;

    @Enumerated(EnumType.STRING)
    private Role role;

    @ElementCollection
    @CollectionTable(name = "staff_fields", joinColumns = @JoinColumn(name = "staff_id"))
    @Column(name = "field")
    private List<String> field;

    @ElementCollection
    @CollectionTable(name = "staff_vehicles", joinColumns = @JoinColumn(name = "staff_id"))
    @Column(name = "vehicle")
    private List<String> vehicle;
}

