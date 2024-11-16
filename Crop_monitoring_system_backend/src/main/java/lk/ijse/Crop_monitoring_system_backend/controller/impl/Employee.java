/*
package lk.ijse.Crop_monitoring_system_backend.controller.impl;


import lk.ijse.Crop_monitoring_system_backend.controller.EmployeeController;
import lk.ijse.Crop_monitoring_system_backend.dto.EmployeeDTO;
import lk.ijse.Crop_monitoring_system_backend.dto.FieldDTO;
import lk.ijse.Crop_monitoring_system_backend.dto.extra.EmployeeCountDTO;
import lk.ijse.Crop_monitoring_system_backend.dto.extra.EmployeeDesigCountsDTO;
import lk.ijse.Crop_monitoring_system_backend.service.EmployeeService;
import lk.ijse.Crop_monitoring_system_backend.util.enums.Designation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/employee")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class Employee implements EmployeeController<String, EmployeeDTO> {

    private final EmployeeService employeeService;

    @GetMapping("/health")
    public String healthCheck() {
        return "Hello I'm Employee Controller. I'm OK! Have a nice day!";
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public boolean saveEmployee(@RequestBody EmployeeDTO employeeDTO) {
        return employeeService.add(employeeDTO);
    }

    @PutMapping
    public boolean updateEmployee(@RequestBody EmployeeDTO employeeDTO) {
        return employeeService.update(employeeDTO);
    }

    @DeleteMapping
    public boolean deleteEmployee(@RequestParam String employee_code) {
        return employeeService.delete(employee_code);
    }

    @GetMapping
    public EmployeeDTO searchEmployee(@RequestParam String employee_code) {
        return employeeService.search(employee_code);
    }

    @GetMapping("/all")
    public List<EmployeeDTO> getAllEmployees() {
        return employeeService.getAll();
    }

    @GetMapping("/field")
    public FieldDTO getField(@RequestParam String employee_code) {
        return employeeService.getField(employee_code);
    }

    @GetMapping("/designations")
    public List<Designation> getDesignations() {
        return employeeService.getDesignations();
    }

    @GetMapping("/id")
    public String getEmployeeId() {
        return employeeService.getEmployeeCode();
    }

    @GetMapping("/count")
    public EmployeeCountDTO getEmployeeCount() {
        return employeeService.getEmployeeCount();
    }

    @GetMapping("/countDesignation")
    public EmployeeDesigCountsDTO getEmployeeCountByDesignation() {
        return employeeService.getEmployeeCountByDesignation();
    } @GetMapping("/totalField")
    public List<String> getEmployeeCountByField() {
        return employeeService.getEmployeeCountByField();
    }
}
*/
package lk.ijse.Crop_monitoring_system_backend.controller.impl;

import lk.ijse.Crop_monitoring_system_backend.controller.EmployeeController;
import lk.ijse.Crop_monitoring_system_backend.dto.EmployeeDTO;
import lk.ijse.Crop_monitoring_system_backend.dto.extra.EmployeeCountDTO;
import lk.ijse.Crop_monitoring_system_backend.dto.extra.EmployeeDesigCountsDTO;
import lk.ijse.Crop_monitoring_system_backend.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/employee")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class Employee implements EmployeeController<String, EmployeeDTO> {

    private final EmployeeService employeeService;

    @GetMapping("/health")
    public String healthCheck() {
        return "Hello I'm Employee Controller. I'm OK! Have a nice day!";
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public boolean saveEmployee(@RequestBody EmployeeDTO employeeDTO) {
        return employeeService.add(employeeDTO);
    }

    @PutMapping
    public boolean updateEmployee(@RequestBody EmployeeDTO employeeDTO) {
        return employeeService.update(employeeDTO);
    }

    @DeleteMapping
    public boolean deleteEmployee(@RequestParam String id) {
        return employeeService.delete(id);
    }

    @GetMapping
    public EmployeeDTO searchEmployee(@RequestParam String id) {
        return employeeService.search(id);
    }

    @GetMapping("/all")
    public List<EmployeeDTO> getAllEmployees() {
        return employeeService.getAll();
    }

    @GetMapping("/designations")
    public List<String> getDesignations() {
        return employeeService.getDesignations();
    }

    @GetMapping("/id")
    public String getEmployeeId() {
        return employeeService.getEmployeeCode();
    }

    @GetMapping("/count")
    public EmployeeCountDTO getEmployeeCount() {
        return employeeService.getEmployeeCount();
    }

    @GetMapping("/countDesignation")
    public EmployeeDesigCountsDTO getEmployeeCountByDesignation() {
        return employeeService.getEmployeeCountByDesignation();
    }

    @GetMapping("/fields")
    public List<String> getEmployeeFields(@RequestParam String id) {
        return employeeService.getFieldsByEmployeeId(id);
    }

    @GetMapping("/vehicles")
    public List<String> getEmployeeVehicles(@RequestParam String id) {
        return employeeService.getVehiclesByEmployeeId(id);
    }
}