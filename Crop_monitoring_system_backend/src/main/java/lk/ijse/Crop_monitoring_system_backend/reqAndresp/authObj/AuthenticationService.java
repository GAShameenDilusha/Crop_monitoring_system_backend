package lk.ijse.Crop_monitoring_system_backend.reqAndresp.authObj;


import lk.ijse.Crop_monitoring_system_backend.reqAndresp.response.JwtAuthResponse;
import lk.ijse.Crop_monitoring_system_backend.reqAndresp.secure.SignIn;
import lk.ijse.Crop_monitoring_system_backend.reqAndresp.secure.SignUp;
public interface AuthenticationService {
    JwtAuthResponse signIn(SignIn signIn);
    JwtAuthResponse signUp(SignUp signIn);
    String refreshToken(String token);

}
