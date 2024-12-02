package lk.ijse.Crop_monitoring_system_backend.Dao;


import lk.ijse.Crop_monitoring_system_backend.Entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserDao extends JpaRepository<UserEntity,String> {


    Optional<UserEntity> findByEmail(String email);
}
