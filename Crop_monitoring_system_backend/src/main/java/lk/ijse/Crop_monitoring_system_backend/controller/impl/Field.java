package lk.ijse.Crop_monitoring_system_backend.controller.impl;

import lk.ijse.Crop_monitoring_system_backend.dto.FieldDTO;
import lk.ijse.Crop_monitoring_system_backend.service.FieldService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/v1/field")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class Field {

    private final FieldService fieldService;


    @Override
    @PostMapping
    public boolean saveField(@RequestBody FieldDTO fieldDTO) {
        return fieldService.add(fieldDTO);
    }

    @Override
    @PutMapping
    public boolean updateField(@RequestBody FieldDTO fieldDTO) {
        return fieldService.update(fieldDTO);
    }

    @Override
    @DeleteMapping
    public boolean deleteField(@RequestParam String field_code) {
        return fieldService.delete(field_code);
    }

    @Override
    @GetMapping
    public FieldDTO searchField(@RequestParam String field_code) {
        try {

            return fieldService.search(field_code);
        } catch (Exception e) {
            return null;
        }

    }

    @Override
    @GetMapping("/all")
    public List<FieldDTO> getAllFieldes() {
        return fieldService.getAll();
    }

    @Override
    @GetMapping("/health")
    public String healthCheck() {
        return "Hello I'm Field Controller. I'm OK! Have a nice day!";
    }

    @GetMapping("/id")
    public String getFieldId() {
        return fieldService.getFieldCode();
    }
}
