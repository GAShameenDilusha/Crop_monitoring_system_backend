package lk.ijse.Crop_monitoring_system_backend.service.impl;

import jakarta.transaction.Transactional;
import lk.ijse.Crop_monitoring_system_backend.dto.FieldDTO;
import lk.ijse.Crop_monitoring_system_backend.entity.FieldEntity;
import lk.ijse.Crop_monitoring_system_backend.repository.FieldRepo;
import lk.ijse.Crop_monitoring_system_backend.service.FieldService;
import lk.ijse.Crop_monitoring_system_backend.util.convert.Converter;
import lk.ijse.Crop_monitoring_system_backend.util.map.Mapping;
import lombok.RequiredArgsConstructor;


import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class FieldServiceIMPL implements FieldService {

    private final FieldRepo fieldRepo;
    private final Mapping mapping;
    private final Converter converter;

    @Override
    public boolean add(FieldDTO fieldDTO) {
        FieldEntity fieldEntity = mapping.mapToFieldEntity(fieldDTO);
        fieldRepo.save(fieldEntity);
        return fieldRepo.existsById(fieldEntity.getField_code());
    }

    @Override
    public boolean delete(String field_code) {
        if (fieldRepo.existsById(field_code)) {
            fieldRepo.deleteById(field_code);
            return true;
        } else {
            return false;
        }

    }

    @Override
    public boolean update(FieldDTO fieldDTO) {
        Optional<FieldEntity> tmpField = fieldRepo.findById(fieldDTO.getFieldCode());
        if (tmpField.isPresent()) {
            converter.convertFieldEntity(fieldDTO, tmpField.get());
            return true;
        }
        return false;
    }

    @Override
    public FieldDTO search(String field_code) {


        FieldEntity fieldEntity = fieldRepo.getReferenceById(field_code);
        return mapping.mapToFieldDTO(fieldEntity);

    }

    @Override
    public List<FieldDTO> getAll() {
        List<FieldEntity> fieldes = fieldRepo.findAll();
        return mapping.mapToFieldDTOList(fieldes);
    }

    @Override
    public String getFieldCode() {
        String field_code =  fieldRepo.getFieldCode();
        if (field_code == null) {
            return "B001";
        } else {
            int num = Integer.parseInt(field_code.substring(1));
            num++;
            if (num < 10) {
                return "B00" + num;
            } else if (num < 100) {
                return "B0" + num;
            } else {
                return "B" + num;
            }
        }
    }

    @Override
    public String getFieldName(String fieldCode) {
        return fieldRepo.getFieldName(fieldCode);
    }
}
