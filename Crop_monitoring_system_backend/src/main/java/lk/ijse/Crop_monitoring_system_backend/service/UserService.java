package lk.ijse.Crop_monitoring_system_backend.service;

import lk.ijse.Crop_monitoring_system_backend.dto.UserDTO;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService {
    UserDetailsService userDetailsService();
    void saveUser(UserDTO userDTO);

    String getRole(String email);

    String getEmployeeCode(String cashierName);

    List<UserDTO> getAllUsers();

    boolean deleteUser(String email);
}
