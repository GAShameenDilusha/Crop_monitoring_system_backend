package lk.ijse.Crop_monitoring_system_backend.Controller;


import lk.ijse.Crop_monitoring_system_backend.Dto.impl.UserDto;
import lk.ijse.Crop_monitoring_system_backend.service.UserService;
import lk.ijse.Crop_monitoring_system_backend.util.Regex;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.regex.Pattern;

@RestController
@RequestMapping("api/v1/users")
@CrossOrigin
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<UserDto> getAllUsers(){
        return userService.findAll();
    }
    @DeleteMapping(value = "/{email}")
    public ResponseEntity<Void> deleteUser(@PathVariable("email") String email){

        //validate email
          if (!Pattern.matches(String.valueOf(Regex.getEmailPattern()),email)){
              return new ResponseEntity<>(HttpStatus.BAD_REQUEST); // Invalid email format
          }
        // Fetch user by email
        Optional<UserDto> userDtoOptional = userService.findByEmail(email);
        if (userDtoOptional.isPresent()) {
            // Get the user's ID
            String userId = userDtoOptional.get().getId();
            userService.delete(userId);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND); // User with email not found
        }

    }
    @PutMapping(value = "/{email}")
    public ResponseEntity<UserDto> updateUser(@PathVariable("email") String email, @RequestBody UserDto userDto) {
        // Validate email format
        if (!Pattern.matches(String.valueOf(Regex.getEmailPattern()), email)) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST); // Invalid email format
        }

        // Check if the user exists
        Optional<UserDto> userDtoOptional = userService.findByEmail(email);
        if (userDtoOptional.isPresent()) {
            UserDto user = userDtoOptional.get();

            // Update fields in userEntity based on userDto
            user.setEmail(userDto.getEmail());
            user.setPassword(userDto.getPassword());
            user.setRole(userDto.getRole());


            // Save the updated entity back to the database
            UserDto updatedUser = userService.update(user.getId(),user);


            return new ResponseEntity<>(updatedUser, HttpStatus.OK); // Success
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND); // User with email not found
        }
    }


}
