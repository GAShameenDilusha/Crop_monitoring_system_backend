package lk.ijse.Crop_monitoring_system_backend.service.impl;


import lk.ijse.Crop_monitoring_system_backend.Dao.FieldDao;
import lk.ijse.Crop_monitoring_system_backend.Dao.StaffDao;
import lk.ijse.Crop_monitoring_system_backend.Dto.impl.FieldDto;
import lk.ijse.Crop_monitoring_system_backend.Dto.impl.StaffDto;
import lk.ijse.Crop_monitoring_system_backend.Entity.FieldEntity;
import lk.ijse.Crop_monitoring_system_backend.Entity.StaffEntity;
import lk.ijse.Crop_monitoring_system_backend.Exception.FieldNotFoundException;
import lk.ijse.Crop_monitoring_system_backend.service.FieldService;
import lk.ijse.Crop_monitoring_system_backend.util.AppUtil;
import lk.ijse.Crop_monitoring_system_backend.util.Mapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class FieldServiceImpl implements FieldService {
    @Autowired
    private FieldDao fieldDao;
    @Autowired
    private StaffDao staffDao;
    @Autowired
    private Mapping fieldMapping;
    @Override
    @PreAuthorize("hasRole('MANAGER') or hasRole('SCIENTIST')")
    public FieldDto save(FieldDto dto) {

        dto.setFieldId(AppUtil.generateFieldId());
        FieldEntity field = fieldMapping.toFieldEntity(dto);
        try {
            return fieldMapping.toFieldDto(fieldDao.save(field));
        } catch (Exception e) {
            throw new RuntimeException("Error saving field: " + e.getMessage(), e);
        }
    }

    @Override
   @PreAuthorize("hasRole('MANAGER') or hasRole('SCIENTIST')")
    public FieldDto update(String id, FieldDto dto)  {
        FieldEntity existingField = fieldDao.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Field not found with ID: " + id));

        // Update basic field properties
        existingField.setName(dto.getName());
        existingField.setSize(dto.getSize());
        existingField.setLocation(dto.getLocation());
        // Update staff members if provided
        if (dto.getStaffIds() != null && !dto.getStaffIds().isEmpty()) {
            List<StaffEntity> staffEntities = staffDao.findAllById(dto.getStaffIds());
            if (staffEntities.size() != dto.getStaffIds().size()) {
                throw new IllegalArgumentException("One or more staff IDs are invalid.");
            }
            existingField.setStaffMembers(new HashSet<>(staffEntities));
        } else {
            existingField.getStaffMembers().clear();  // Clear existing staff if no IDs are provided
        }

        // Handle images if provided
        if (dto.getImage1() != null) {
            existingField.setImage1(dto.getImage1());
        }

        if (dto.getImage2() != null) {
            existingField.setImage2(dto.getImage2());
        }

        // Save the updated field entity
        return fieldMapping.toFieldDto(fieldDao.save(existingField));

    }

    @Override
    @PreAuthorize("hasRole('MANAGER') or hasRole('SCIENTIST')")
    public void delete(String id) {
        FieldEntity field = fieldDao.findById(id)
                .orElseThrow(() -> new FieldNotFoundException("Field not found with ID: "+id ));

        // Remove associations with staff members
        field.getStaffMembers().forEach(staff -> staff.getFields().remove(field));
        field.getLogs().forEach(log -> log.getFieldLogs().remove(field));
        field.getStaffMembers().clear();
        field.getLogs().clear();
        fieldDao.delete(field);

    }

    @Override
   // @PreAuthorize("hasRole('MANAGER') or hasRole('ADMINISTRATOR') or hasRole('SCIENTIST')")
    public FieldDto findById(String id) {
        Optional<FieldEntity> byId = fieldDao.findById(id);
        if (byId.isPresent()){
            return fieldMapping.toFieldDto(byId.get());
        }
        return null;
    }

    @Override
    @PreAuthorize("hasRole('MANAGER') or hasRole('ADMINISTRATOR') or hasRole('SCIENTIST')")
    public List<FieldDto> findAll() {
        return fieldMapping.asFieldDtoList(fieldDao.findAll());
    }


    @Override
    //@PreAuthorize("hasRole('MANAGER') or hasRole('ADMINISTRATOR') or hasRole('SCIENTIST')")
    public List<StaffDto> getStaffIdsByFieldId(String fieldId) {
        FieldEntity field = fieldDao.findById(fieldId)
                .orElseThrow(() -> new IllegalArgumentException("Field not found with ID: " + fieldId));

        return fieldMapping.asStaffDtoList(new ArrayList<>(field.getStaffMembers()));

    }
}
