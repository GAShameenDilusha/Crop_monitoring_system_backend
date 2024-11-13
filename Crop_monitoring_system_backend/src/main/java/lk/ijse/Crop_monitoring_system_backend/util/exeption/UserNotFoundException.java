package lk.ijse.Crop_monitoring_system_backend.util.exeption;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String message) {
        super(message);
    }
}
