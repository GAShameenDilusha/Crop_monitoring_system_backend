package lk.ijse.Crop_monitoring_system_backend.Controller;


import lk.ijse.Crop_monitoring_system_backend.Dto.impl.StaffDto;
import lk.ijse.Crop_monitoring_system_backend.Dto.impl.UserDto;
import lk.ijse.Crop_monitoring_system_backend.Secure.JWTAuthResponse;
import lk.ijse.Crop_monitoring_system_backend.Secure.SignIn;
import lk.ijse.Crop_monitoring_system_backend.service.AuthService;
import lk.ijse.Crop_monitoring_system_backend.service.StaffService;
import lk.ijse.Crop_monitoring_system_backend.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RequestMapping("api/v1/auth")
@RestController
@RequiredArgsConstructor
@CrossOrigin
public class AuthController {
    private final StaffService staffService;
    private final UserService userService;
    private final AuthService authService;


    @PostMapping(value = "signup", consumes = MediaType.APPLICATION_JSON_VALUE)
    //@PreAuthorize("hasRole('MANAGER') or hasRole('ADMINISTRATOR') or hasRole('SCIENTIST')")
    public ResponseEntity<JWTAuthResponse> createUser(@RequestBody UserDto userDto) {
        System.out.println(userDto);
        try {
            // Check if a staff member exists with the given email
            Optional<StaffDto> existingStaff = staffService.findByEmail(userDto.getEmail());

            if (!existingStaff.isPresent()) {
                // Save new staff member if none exists
                StaffDto newStaff = new StaffDto();
                newStaff.setEmail(userDto.getEmail());
                newStaff.setRole(userDto.getRole());


                newStaff = staffService.save(newStaff);

                // Set the saved staff ID to the user DTO
                userDto.setStaffId(newStaff.getStaffId());
            } else {
                // Link to the existing staff member
                userDto.setStaffId(existingStaff.get().getStaffId());
            }

            // Save the user
            return ResponseEntity.ok(authService.signUp(userDto));
        } catch (Exception e) {
           e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping(value = "signIn",consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<JWTAuthResponse> signIn(@RequestBody SignIn signIn){
        return ResponseEntity.ok(authService.signIn(signIn));

    }
    @PostMapping("refresh")
    public ResponseEntity<JWTAuthResponse> refreshToken(@RequestParam("existingToken") String existingToken) {


        return ResponseEntity.ok(authService.refreshToken(existingToken));
    }

}
