package lk.ijse.Crop_monitoring_system_backend.service;

import org.springframework.security.core.userdetails.UserDetails;

public interface JwtService {
    String extractUserName(String token);
    String generateToken(UserDetails user);
    boolean validateToken(String token,UserDetails user);
    String refreshToken(UserDetails userDetails);
}
