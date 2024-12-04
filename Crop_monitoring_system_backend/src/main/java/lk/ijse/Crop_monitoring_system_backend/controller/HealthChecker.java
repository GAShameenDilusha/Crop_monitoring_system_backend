package lk.ijse.Crop_monitoring_system_backend.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/health")
@CrossOrigin
public class HealthChecker {

        @GetMapping
        public String healthTest(){
            return "Crop System testing";
        }
}
