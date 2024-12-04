package lk.ijse.Crop_monitoring_system_backend.service.impl;


import lk.ijse.Crop_monitoring_system_backend.Dao.EquipmentDao;
import lk.ijse.Crop_monitoring_system_backend.Dao.FieldDao;
import lk.ijse.Crop_monitoring_system_backend.Dao.StaffDao;
import lk.ijse.Crop_monitoring_system_backend.Dto.impl.EquipmentDto;
import lk.ijse.Crop_monitoring_system_backend.Entity.EquipmentEntity;
import lk.ijse.Crop_monitoring_system_backend.Entity.FieldEntity;
import lk.ijse.Crop_monitoring_system_backend.Entity.StaffEntity;
import lk.ijse.Crop_monitoring_system_backend.service.EquipmentService;
import lk.ijse.Crop_monitoring_system_backend.util.AppUtil;
import lk.ijse.Crop_monitoring_system_backend.util.Mapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EquipmentServiceImpl implements EquipmentService {
    @Autowired
    private FieldDao fieldDao;
    @Autowired
    private StaffDao staffDao;
    @Autowired
    private EquipmentDao equipmentDao;
    @Autowired
    private Mapping equipmentMapper;
    @Override
    @PreAuthorize("hasRole('MANAGER') or hasRole('ADMINISTRATOR')")
    public EquipmentDto save(EquipmentDto dto) {
        dto.setEquipmentId(AppUtil.generateEquipmentId());
        EquipmentEntity equipment = equipmentMapper.toEquipmentEntity(dto);
        equipment = equipmentDao.save(equipment);
        return equipmentMapper.toEquipmentDto(equipment);

    }

    @Override
    @PreAuthorize("hasRole('MANAGER') or hasRole('ADMINISTRATOR')")
    public EquipmentDto update(String id, EquipmentDto dto) {
        EquipmentEntity equipment = equipmentDao.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Equipment not found with ID: " + id));

        equipment.setType(dto.getType());
        equipment.setName(dto.getName());
        equipment.setStatus(dto.getStatus());

        if (dto.getFieldId() != null) {
            FieldEntity field = fieldDao.findById(dto.getFieldId())
                    .orElseThrow(() -> new IllegalArgumentException("Field not found with ID: " + dto.getFieldId()));
            equipment.setField(field);
        }

        if (dto.getStaffId() != null) {
            StaffEntity staff = staffDao.findById(dto.getStaffId())
                    .orElseThrow(() -> new IllegalArgumentException("Staff not found with ID: " + dto.getStaffId()));
            equipment.setStaff(staff);
        }

        return equipmentMapper.toEquipmentDto(equipmentDao.save(equipment));
    }

    @Override
    @PreAuthorize("hasRole('MANAGER') or hasRole('ADMINISTRATOR')")
    public void delete(String id) {
      equipmentDao.deleteById(id);
    }

    @Override
    @PreAuthorize("hasRole('MANAGER') or hasRole('ADMINISTRATOR') or hasRole('SCIENTIST')")
    public EquipmentDto findById(String id) {
        EquipmentEntity equipment = equipmentDao.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Equipment not found with ID: " + id));
        return equipmentMapper.toEquipmentDto(equipment);
    }

    @Override
    @PreAuthorize("hasRole('MANAGER') or hasRole('ADMINISTRATOR') or hasRole('SCIENTIST')")
    public List<EquipmentDto> findAll() {
        return equipmentMapper.asEquipmentDtoList(equipmentDao.findAll());
    }
    public List<EquipmentDto> getEquipmentByStaffId(String staffId) {
        StaffEntity staff = staffDao.findById(staffId)
                .orElseThrow(() -> new IllegalArgumentException("Staff not found with ID: " + staffId));
        List<EquipmentEntity> equipmentList = equipmentDao.findByStaff(staff);
        return equipmentMapper.asEquipmentDtoList(equipmentList);
    }
    public List<EquipmentDto> getEquipmentByFieldId(String fieldId) {
        FieldEntity field = fieldDao.findById(fieldId)
                .orElseThrow(() -> new IllegalArgumentException("Field not found with ID: " + fieldId));
        List<EquipmentEntity> equipmentList = equipmentDao.findByField(field);
        return equipmentMapper.asEquipmentDtoList(equipmentList);
    }
}
