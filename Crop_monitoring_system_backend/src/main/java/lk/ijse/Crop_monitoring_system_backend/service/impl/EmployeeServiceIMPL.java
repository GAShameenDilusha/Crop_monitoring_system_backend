/*
package lk.ijse.Crop_monitoring_system_backend.service.impl;

import jakarta.transaction.Transactional;

import lk.ijse.Crop_monitoring_system_backend.dto.EmployeeDTO;
import lk.ijse.Crop_monitoring_system_backend.dto.FieldDTO;
import lk.ijse.Crop_monitoring_system_backend.dto.extra.EmployeeCountDTO;
import lk.ijse.Crop_monitoring_system_backend.dto.extra.EmployeeDesigCountsDTO;
import lk.ijse.Crop_monitoring_system_backend.entity.EmployeeEntity;
import lk.ijse.Crop_monitoring_system_backend.repository.EmployeeRepo;
import lk.ijse.Crop_monitoring_system_backend.service.EmployeeService;
import lk.ijse.Crop_monitoring_system_backend.service.FieldService;
import lk.ijse.Crop_monitoring_system_backend.util.convert.Converter;
import lk.ijse.Crop_monitoring_system_backend.util.enums.Designation;
import lk.ijse.Crop_monitoring_system_backend.util.enums.Role;
import lk.ijse.Crop_monitoring_system_backend.util.map.Mapping;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class EmployeeServiceIMPL implements EmployeeService {

    private final EmployeeRepo employeeRepo;
    private final Mapping mapping;
    private final Converter converter;
    private final FieldService fieldService;

    @Override
    public boolean add(EmployeeDTO employeeDTO) {

        EmployeeEntity employeeEntity = mapping.mapToEmployeeEntity(employeeDTO);
        employeeEntity.setActive_state("ACTIVE");
        employeeRepo.save(employeeEntity);
        return employeeRepo.existsById(employeeEntity.getEmployee_code());
    }

    @Override
    public boolean delete(String employee_code) {
        if (employeeRepo.existsById(employee_code)) {
            employeeRepo.changeActiveState("DEACTIVATE", employee_code);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean update(EmployeeDTO employeeDTO) {

        employeeDTO.setActive_state("ACTIVE");

        String profilePic = employeeDTO.getProfile_pic();
        if (profilePic == null || profilePic.isEmpty()) {
            EmployeeEntity employeeEntity = employeeRepo.getReferenceById(employeeDTO.getEmployee_code());
            employeeDTO.setProfile_pic(employeeEntity.getProfile_pic());
        }

        return add(employeeDTO);

*/
/*        Optional<EmployeeEntity> tmpEmployee = employeeRepo.findById(employeeDTO.getEmployee_code());
        System.out.println(tmpEmployee);

        if (tmpEmployee.isPresent()) {
           // converter.convertEmployeeEntity(employeeDTO, tmpEmployee.get());
            return true;
        }
        return false;*//*

    }

    @Override
    public EmployeeDTO search(String employee_code) {
        EmployeeEntity employeeEntity = employeeRepo.getReferenceById(employee_code);
        System.out.println(employeeEntity.getField().getField_code());
        EmployeeDTO employeeDTO = mapping.mapToEmployeeDTO(employeeEntity);
        System.out.println(employeeDTO.getField().getField_code());
        return employeeDTO;
    }

    @Override
    public List<EmployeeDTO> getAll() {
        List<EmployeeEntity> employeeEntities = employeeRepo.findAll();
        return mapping.mapToEmployeeDTOList(employeeEntities);

    }

    @Override
    public FieldDTO getField(String employeeCode) {
        EmployeeEntity employeeEntity = employeeRepo.getReferenceById(employeeCode);
        employeeEntity.getField().setEmployees(null);
        return mapping.mapToFieldDTO(employeeEntity.getField());
    }

    @Override
    public String getEmployeeCode() {
        String currentEmpCode = employeeRepo.getEmployeeCode();
        if (currentEmpCode == null) {
            return "E001";
        } else {
            int empCode = Integer.parseInt(currentEmpCode.substring(1)) + 1;
            if (empCode < 10) {
                return "E00" + empCode;
            } else if (empCode < 100) {
                return "E0" + empCode;
            } else {
                return "E" + empCode;
            }
        }
    }

    @Override
    public List<Designation> getDesignations() {
        List<Designation> designations = List.of(Designation.values());
        return designations;

    }

    @Override
    public EmployeeCountDTO getEmployeeCount() {
        List<EmployeeEntity> employeeEntities = employeeRepo.findAll();

        int admin_employee_count = 0;
        int user_employee_count = 0;

        for (EmployeeEntity employeeEntity : employeeEntities) {
            if (employeeEntity.getRole().equals(Role.ADMIN)) {
                admin_employee_count++;
            } else {
                user_employee_count++;
            }
        }


        return new EmployeeCountDTO(employeeEntities.size(), admin_employee_count, user_employee_count);

    }

    @Override
    public EmployeeDesigCountsDTO getEmployeeCountByDesignation() {
List<EmployeeEntity> employeeEntities = employeeRepo.findAll();

        int manager = 0;
        int stockKeeper = 0;
        int delivery = 0;
        int cashier = 0;
        int cleaner = 0;
        int securityGuard = 0;

        for (EmployeeEntity employeeEntity : employeeEntities) {
            switch (employeeEntity.getDesignation()) {
                case MANAGER:
                    manager++;
                    break;
                case STOCK_KEEPER:
                    stockKeeper++;
                    break;
                case DELIVERY:
                    delivery++;
                    break;
                case CASHIER:
                    cashier++;
                    break;
                case CLEANER:
                    cleaner++;
                    break;
                case SECURITY_GUARD:
                    securityGuard++;
                    break;
            }
        }

        return new EmployeeDesigCountsDTO(manager, stockKeeper, delivery, cashier, cleaner, securityGuard);

    }

    @Override
    public String getFieldCodeByEmployeeCode(String cashierName) {
        return  employeeRepo.getFieldCodeByEmployeeCode(cashierName);

    }

    @Override
    public List<String> getEmployeeCountByField() {
        List<FieldDTO> fieldes = fieldService.getAll();

        List<EmployeeEntity> employeeEntities = employeeRepo.findAll();

        List<String> empCountsField = new ArrayList<>();

        for (FieldDTO field : fieldes) {
            int count = 0;
            for (EmployeeEntity employeeEntity : employeeEntities) {
                if (employeeEntity.getField().getField_code().equals(field.getFieldCode())) {
                    count++;
                }
            }
            empCountsField.add(field.getFieldName() );
            empCountsField.add(String.valueOf(count));
        }
        return empCountsField;


    }


}
*/
package lk.ijse.Crop_monitoring_system_backend.service.impl;

import jakarta.transaction.Transactional;
import lk.ijse.Crop_monitoring_system_backend.dto.EmployeeDTO;
import lk.ijse.Crop_monitoring_system_backend.dto.extra.EmployeeCountDTO;
import lk.ijse.Crop_monitoring_system_backend.dto.extra.EmployeeDesigCountsDTO;
import lk.ijse.Crop_monitoring_system_backend.entity.EmployeeEntity;
import lk.ijse.Crop_monitoring_system_backend.repository.EmployeeRepo;
import lk.ijse.Crop_monitoring_system_backend.service.EmployeeService;

import lk.ijse.Crop_monitoring_system_backend.util.convert.Converter;
import lk.ijse.Crop_monitoring_system_backend.util.enums.Role;
import lk.ijse.Crop_monitoring_system_backend.util.map.Mapping;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class EmployeeServiceIMPL implements EmployeeService {

    private final EmployeeRepo employeeRepo;
    private final Mapping mapping;
    private final Converter converter;

    @Override
    public boolean add(EmployeeDTO employeeDTO) {
        EmployeeEntity employeeEntity = mapping.mapToEmployeeEntity(employeeDTO);
        employeeRepo.save(employeeEntity);
        return employeeRepo.existsById(employeeEntity.getId());
    }

    @Override
    public boolean delete(String employeeId) {
        if (employeeRepo.existsById(employeeId)) {
            employeeRepo.deleteById(employeeId);
            return true;
        }
        return false;
    }

    @Override
    public boolean update(EmployeeDTO employeeDTO) {
        Optional<EmployeeEntity> existingEmployee = employeeRepo.findById(employeeDTO.getId());
        if (existingEmployee.isPresent()) {
            EmployeeEntity employeeEntity = mapping.mapToEmployeeEntity(employeeDTO);
            // Preserve existing fields and vehicles if not provided in update
            if (employeeDTO.getField() == null || employeeDTO.getField().isEmpty()) {
                employeeEntity.setField(existingEmployee.get().getField());
            }
            if (employeeDTO.getVehicle() == null || employeeDTO.getVehicle().isEmpty()) {
                employeeEntity.setVehicle(existingEmployee.get().getVehicle());
            }
            employeeRepo.save(employeeEntity);
            return true;
        }
        return false;
    }

    @Override
    public EmployeeDTO search(String employeeId) {
        Optional<EmployeeEntity> employeeEntity = employeeRepo.findById(employeeId);
        return employeeEntity.map(mapping::mapToEmployeeDTO).orElse(null);
    }

    @Override
    public List<EmployeeDTO> getAll() {
        List<EmployeeEntity> employeeEntities = employeeRepo.findAll();
        return mapping.mapToEmployeeDTOList(employeeEntities);
    }

    @Override
    public String getEmployeeCode() {
        String currentEmpCode = employeeRepo.getEmployeeCode();
        if (currentEmpCode == null) {
            return "E001";
        }
        int empCode = Integer.parseInt(currentEmpCode.substring(1)) + 1;
        if (empCode < 10) {
            return "E00" + empCode;
        } else if (empCode < 100) {
            return "E0" + empCode;
        }
        return "E" + empCode;
    }

    @Override
    public List<String> getDesignations() {
        return employeeRepo.findDistinctDesignations();
    }

    @Override
    public EmployeeCountDTO getEmployeeCount() {
        List<EmployeeEntity> employeeEntities = employeeRepo.findAll();

        int adminCount = 0;
        int userCount = 0;

        for (EmployeeEntity employee : employeeEntities) {
            if (employee.getRole() == Role.ADMIN) {
                adminCount++;
            } else {
                userCount++;
            }
        }

        return new EmployeeCountDTO(employeeEntities.size(), adminCount, userCount);
    }

    @Override
    public EmployeeDesigCountsDTO getEmployeeCountByDesignation() {
        List<EmployeeEntity> employees = employeeRepo.findAll();

        int manager = 0;
        int stockKeeper = 0;
        int delivery = 0;
        int cashier = 0;
        int cleaner = 0;
        int securityGuard = 0;

        for (EmployeeEntity employee : employees) {
            switch (employee.getDesignation().toUpperCase()) {
                case "MANAGER":
                    manager++;
                    break;
                case "STOCK_KEEPER":
                    stockKeeper++;
                    break;
                case "DELIVERY":
                    delivery++;
                    break;
                case "CASHIER":
                    cashier++;
                    break;
                case "CLEANER":
                    cleaner++;
                    break;
                case "SECURITY_GUARD":
                    securityGuard++;
                    break;
            }
        }

        return new EmployeeDesigCountsDTO(manager, stockKeeper, delivery, cashier, cleaner, securityGuard);
    }

    @Override
    public List<String> getFieldsByEmployeeId(String employeeId) {
        Optional<EmployeeEntity> employee = employeeRepo.findById(employeeId);
        return employee.map(EmployeeEntity::getField).orElse(new ArrayList<>());
    }

    @Override
    public List<String> getVehiclesByEmployeeId(String employeeId) {
        Optional<EmployeeEntity> employee = employeeRepo.findById(employeeId);
        return employee.map(EmployeeEntity::getVehicle).orElse(new ArrayList<>());
    }
}