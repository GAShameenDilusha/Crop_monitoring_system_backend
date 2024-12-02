package lk.ijse.Crop_monitoring_system_backend.service;


import lk.ijse.Crop_monitoring_system_backend.Dto.impl.UserDto;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.Optional;

public interface UserService extends BaseService<UserDto>{
    Optional<UserDto> findByEmail(String email);

    UserDetailsService userDetailService();
}
