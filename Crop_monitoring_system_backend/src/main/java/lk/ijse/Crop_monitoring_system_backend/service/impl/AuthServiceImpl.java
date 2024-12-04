package lk.ijse.Crop_monitoring_system_backend.service.impl;


import lk.ijse.Crop_monitoring_system_backend.Dao.UserDao;
import lk.ijse.Crop_monitoring_system_backend.Dto.impl.UserDto;
import lk.ijse.Crop_monitoring_system_backend.Entity.UserEntity;
import lk.ijse.Crop_monitoring_system_backend.Exception.UserNotFoundException;
import lk.ijse.Crop_monitoring_system_backend.Secure.JWTAuthResponse;
import lk.ijse.Crop_monitoring_system_backend.Secure.SignIn;
import lk.ijse.Crop_monitoring_system_backend.service.AuthService;
import lk.ijse.Crop_monitoring_system_backend.service.JwtService;
import lk.ijse.Crop_monitoring_system_backend.util.AppUtil;
import lk.ijse.Crop_monitoring_system_backend.util.Mapping;
import lombok.RequiredArgsConstructor;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {
    private final UserDao userDao;
    private final Mapping mapping;
    private final JwtService jwtService;
    private final AuthenticationManager authenticationManager;
    private final PasswordEncoder passwordEncoder;
    @Override
    public JWTAuthResponse signIn(SignIn signIn) {
        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(signIn.getEmail(),signIn.getPassword()));
        var user = userDao.findByEmail(signIn.getEmail())
                .orElseThrow(() -> new UserNotFoundException("User Not found"));
        var generatedToken = jwtService.generateToken(user);

        return JWTAuthResponse.builder().token(generatedToken).build();
    }

    //save user in db and issue a token
    @Override
    public JWTAuthResponse signUp(UserDto userDTO) {
        userDTO.setId(AppUtil.generateUserId());
        userDTO.setPassword(passwordEncoder.encode(userDTO.getPassword()));
        //save user
        UserEntity user = mapping.toUserEntity(userDTO);
        System.out.println(user);
        UserEntity savedUser = userDao.save(user);
       // System.out.println(savedUser);
        //generate token
        var token = jwtService.generateToken(savedUser);
        return JWTAuthResponse.builder().token(token).build();
    }

    @Override
    public JWTAuthResponse refreshToken(String accessToken) {
        //extract username from existing token
        var userName= jwtService.extractUserName(accessToken);
        //check the user availability in the db
        var findUser=  userDao.findByEmail(userName)
                .orElseThrow(() -> new UserNotFoundException("User Not found"));
        var refreshedToken = jwtService.refreshToken(findUser);
        return JWTAuthResponse.builder().token(refreshedToken).build();


    }
}
