package lk.ijse.Crop_monitoring_system_backend.service;


import lk.ijse.Crop_monitoring_system_backend.Dto.impl.UserDto;
import lk.ijse.Crop_monitoring_system_backend.Secure.JWTAuthResponse;
import lk.ijse.Crop_monitoring_system_backend.Secure.SignIn;

public interface AuthService {
    JWTAuthResponse signIn(SignIn signIn);
    JWTAuthResponse signUp(UserDto userDTO);
    JWTAuthResponse refreshToken(String accessToken);
}
