/*
package lk.ijse.Crop_monitoring_system_backend.util.map;

import lk.ijse.Crop_monitoring_system_backend.dto.EmployeeDTO;
import lk.ijse.Crop_monitoring_system_backend.dto.FieldDTO;
import lk.ijse.Crop_monitoring_system_backend.entity.FieldEntity;
import lk.ijse.Crop_monitoring_system_backend.entity.EmployeeEntity;
import lombok.RequiredArgsConstructor;


import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;


import java.util.List;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class Mapping {
    private final ModelMapper modelMapper;

    //customer mappings

  */
/*  public CustomerDTO mapToCustomerDTO(CustomerEntity customerEntity) {
        return modelMapper.map(customerEntity, CustomerDTO.class);

    }

    public CustomerEntity mapToCustomerEntity(CustomerDTO customerDTO) {
        return modelMapper.map(customerDTO, CustomerEntity.class);
    }

    public List<CustomerDTO> mapToCustomerDTOList(List<CustomerEntity> customerEntities) {
        return customerEntities.stream().map(hotel -> modelMapper.map(hotel, CustomerDTO.class)).collect(Collectors.toList());
    }

    //supplier mappings

    public SupplierDTO mapToSupplierDTO(SupplierEntity supplierEntity) {
        return modelMapper.map(supplierEntity, SupplierDTO.class);
    }

    public SupplierEntity mapToSupplierEntity(SupplierDTO supplierDTO) {
        return modelMapper.map(supplierDTO, SupplierEntity.class);
    }

    public List<SupplierDTO> mapToSupplierDTOList(List<SupplierEntity> supplierEntities) {
        return supplierEntities.stream().map(hotel -> modelMapper.map(hotel, SupplierDTO.class)).collect(Collectors.toList());
    }
*//*

    //employee mappings

    public EmployeeDTO mapToEmployeeDTO(EmployeeEntity employeeEntity) {
        if (employeeEntity == null) {
            return null;
        }

        EmployeeDTO employeeDTO = new EmployeeDTO();
        employeeDTO.setEmployee_code(employeeEntity.getEmployee_code());
        employeeDTO.setName(employeeEntity.getName());
        employeeDTO.setProfile_pic(employeeEntity.getProfile_pic());
        employeeDTO.setGender(employeeEntity.getGender());
        employeeDTO.setStatus(employeeEntity.getStatus());
        employeeDTO.setDesignation(employeeEntity.getDesignation());
        employeeDTO.setRole(employeeEntity.getRole());
        employeeDTO.setDob(employeeEntity.getDob());
        employeeDTO.setJoined_date(employeeEntity.getJoined_date());
        employeeDTO.setBuilding_number(employeeEntity.getBuilding_number());
        employeeDTO.setLane(employeeEntity.getLane());
        employeeDTO.setCity(employeeEntity.getCity());
        employeeDTO.setState(employeeEntity.getState());
        employeeDTO.setPostal_code(employeeEntity.getPostal_code());
        employeeDTO.setContact(employeeEntity.getContact());
        employeeDTO.setEmail(employeeEntity.getEmail());
        employeeDTO.setGuardian_name(employeeEntity.getGuardian_name());
        employeeDTO.setGuardian_contact(employeeEntity.getGuardian_contact());

        FieldEntity fieldEntity = employeeEntity.getField();
        if (fieldEntity != null) {
            FieldDTO fieldDTO = new FieldDTO();
            fieldDTO.setFieldCode(fieldEntity.getField_code());
            fieldDTO.setFieldName(fieldEntity.getField_name());
            fieldDTO.setLatitude(fieldEntity.getField_location().getLatitude());
            fieldDTO.setLongitude(fieldEntity.getField_location().getLongitude());
            fieldDTO.setExtentSize(fieldEntity.getExtent_size_of_the_Field());
            fieldDTO.setCrops(fieldEntity.getCrops());
            fieldDTO.setStaff(fieldEntity.getStaff());
            fieldDTO.setFieldImage1(fieldEntity.getField_image1());
            fieldDTO.setFieldImage2(fieldEntity.getField_image2());
            // Add employees if needed
            employeeDTO.setField(fieldDTO);
        }

        return employeeDTO;
    }

    public EmployeeEntity mapToEmployeeEntity(EmployeeDTO employeeDTO) {
        return modelMapper.map(employeeDTO, EmployeeEntity.class);
    }

    public List<EmployeeDTO> mapToEmployeeDTOList(List<EmployeeEntity> employeeEntities) {
        return modelMapper.map(employeeEntities, List.class);
    }

    //inventory mappings
  */
/*  public InventoryDTO mapToInventoryDTO(InventoryEntity inventoryEntity) {
        return modelMapper.map(inventoryEntity, InventoryDTO.class);
    }

    public InventoryEntity mapToInventoryEntity(InventoryDTO inventoryDTO) {
        return modelMapper.map(inventoryDTO, InventoryEntity.class);
    }

    public List<InventoryDTO> mapToInventoryDTOList(List<InventoryEntity> inventoryEntities) {
        return inventoryEntities.stream().map(hotel -> modelMapper.map(hotel, InventoryDTO.class)).collect(Collectors.toList());
    }


    //return mapping
    public ReturnDTO mapToReturnDTO(ReturnEntity returnEntity) {
        return modelMapper.map(returnEntity, ReturnDTO.class);
    }

    public ReturnEntity mapToReturnEntity(ReturnDTO returnDTO) {
        return modelMapper.map(returnDTO, ReturnEntity.class);
    }

    public List<ReturnDTO> mapToReturnDTOList(List<ReturnEntity> returnEntities) {
        return modelMapper.map(returnEntities, List.class);
    }

    //sale mapping
    public SaleDTO mapToSaleDTO(SaleEntity saleEntity) {
        return modelMapper.map(saleEntity, SaleDTO.class);
    }

    public SaleEntity mapToSaleEntity(SaleDTO saleDTO) {
        return modelMapper.map(saleDTO, SaleEntity.class);
    }

    public List<SaleDTO> mapToSaleDTOList(List<SaleEntity> saleEntities) {
        return saleEntities.stream().map(hotel -> modelMapper.map(hotel, SaleDTO.class)).collect(Collectors.toList());
    }

    //size mapping

    public SizeDTO mapToSizeDTO(SizeEntity sizeEntity) {
        return modelMapper.map(sizeEntity, SizeDTO.class);
    }

    public SizeEntity mapToSizeEntity(SizeDTO sizeDTO) {
        return modelMapper.map(sizeDTO, SizeEntity.class);
    }

    public List<SizeDTO> mapToSizeDTOList(List<SizeEntity> sizeEntities) {
        return modelMapper.map(sizeEntities, List.class);
    }

    //sale inventory details mapping

    public SaleInventoryDetailsDTO mapToSaleInventoryDetailsDTO(SaleInventoryDetailsEntity saleInventoryDetailsEntity) {
        return modelMapper.map(saleInventoryDetailsEntity, SaleInventoryDetailsDTO.class);
    }

    public SaleInventoryDetailsEntity mapToSaleInventoryDetailsEntity(SaleInventoryDetailsDTO saleInventoryDetailsDTO) {
        return modelMapper.map(saleInventoryDetailsDTO, SaleInventoryDetailsEntity.class);
    }

    public List<SaleInventoryDetailsDTO> mapToSaleInventoryDetailsDTOList(List<SaleInventoryDetailsEntity> saleInventoryDetailsEntities) {
        return saleInventoryDetailsEntities.stream().map(hotel -> modelMapper.map(hotel, SaleInventoryDetailsDTO.class)).collect(Collectors.toList());
    }

    public List<SaleInventoryDetailsEntity> mapToSaleDetailsDTO(SaleDetailsDTO saleDTO) {


        List<SaleInventoryDetailsEntity> saleInventoryDetailsEntities = new ArrayList<>();


        for (SaleInventoryDetailsDTO saleInventoryDetailsDTO : saleDTO.getSaleInventoryDetailsDTO()) {

            SaleInventoryDetailsEntity saleInventoryDetailsEntity = new SaleInventoryDetailsEntity();

            saleInventoryDetailsEntity.setId(saleInventoryDetailsDTO.getId());
            saleInventoryDetailsEntity.setSale(mapToSaleEntity(saleInventoryDetailsDTO.getSale()));
            saleInventoryDetailsEntity.setInventory(mapToInventoryEntity(saleInventoryDetailsDTO.getInventory()));
            saleInventoryDetailsEntity.setSize(saleInventoryDetailsDTO.getSize());
            saleInventoryDetailsEntity.setSelling_price(saleInventoryDetailsDTO.getSelling_price());
            saleInventoryDetailsEntity.setItem_qty(saleInventoryDetailsDTO.getItem_qty());
            saleInventoryDetailsEntities.add(saleInventoryDetailsEntity);
        }

        return saleInventoryDetailsEntities;


    }

    public List<SizeInventoryDetailsEntity> mapToSizeInventoryDetailsEntity(List<SizeInventoryDetailsDTO> sizeInventoryDetailsDTO) {
        List<SizeInventoryDetailsEntity> sizeInventoryDetailsEntities = new ArrayList<>();
        for (SizeInventoryDetailsDTO sizeInventoryDetailsDTO1 : sizeInventoryDetailsDTO) {
            SizeInventoryDetailsEntity sizeInventoryDetailsEntity = new SizeInventoryDetailsEntity();
            sizeInventoryDetailsEntity.setId(sizeInventoryDetailsDTO1.getId());
            sizeInventoryDetailsEntity.setSize_code(mapToSizeEntity(sizeInventoryDetailsDTO1.getSize()));
            sizeInventoryDetailsEntity.setItem_code(mapToInventoryEntity(sizeInventoryDetailsDTO1.getInventory()));
            sizeInventoryDetailsEntity.setStatus(sizeInventoryDetailsDTO1.getStatus());
            sizeInventoryDetailsEntity.setQty(sizeInventoryDetailsDTO1.getQty());
            sizeInventoryDetailsEntity.setBuying_price(sizeInventoryDetailsDTO1.getBuying_price());
            sizeInventoryDetailsEntity.setSelling_price(sizeInventoryDetailsDTO1.getSelling_price());
            sizeInventoryDetailsEntity.setExpected_profit(sizeInventoryDetailsDTO1.getExpected_profit());
            sizeInventoryDetailsEntity.setProfit_margin(sizeInventoryDetailsDTO1.getProfit_margin());
            sizeInventoryDetailsEntities.add(sizeInventoryDetailsEntity);
        }
        return sizeInventoryDetailsEntities;


    }*//*


    //field mapping

    public FieldDTO mapToFieldDTO(FieldEntity fieldEntity) {
        return modelMapper.map(fieldEntity, FieldDTO.class);
    }

    public FieldEntity mapToFieldEntity(FieldDTO fieldDTO) {
        return modelMapper.map(fieldDTO, FieldEntity.class);
    }

    public List<FieldDTO> mapToFieldDTOList(List<FieldEntity> fieldEntities) {
        return fieldEntities.stream().map(hotel -> modelMapper.map(hotel, FieldDTO.class)).collect(Collectors.toList());
    }

    public List<EmployeeEntity> mapToEmployeeEntities(List<EmployeeDTO> employees) {
        return employees.stream().map(hotel -> modelMapper.map(hotel, EmployeeEntity.class)).collect(Collectors.toList());
    }

  */
/*  public UserEntity toUserEntity(UserDTO userDTO) {
        return modelMapper.map(userDTO, UserEntity.class);
    }

    public void toUserDTO(UserEntity save) {

    }


    public SizeInventoryDetailsDTO mapToSizeInventoryDetailsDTO(SizeInventoryDetailsEntity sizeInventoryDetailsEntity) {
        SizeInventoryDetailsDTO sizeDetailsDTO = new SizeInventoryDetailsDTO();

        sizeDetailsDTO.setId(sizeInventoryDetailsEntity.getId());
        sizeDetailsDTO.setSize(mapToSizeDTO(sizeInventoryDetailsEntity.getSize_code()));
//        sizeDetailsDTO.setInventory(mapToInventoryDTO(sizeInventoryDetailsEntity.getItem_code()));
        sizeDetailsDTO.setStatus(sizeInventoryDetailsEntity.getStatus());
        sizeDetailsDTO.setQty(sizeInventoryDetailsEntity.getQty());
        sizeDetailsDTO.setBuying_price(sizeInventoryDetailsEntity.getBuying_price());
        sizeDetailsDTO.setSelling_price(sizeInventoryDetailsEntity.getSelling_price());
        sizeDetailsDTO.setExpected_profit(sizeInventoryDetailsEntity.getExpected_profit());
        sizeDetailsDTO.setProfit_margin(sizeInventoryDetailsEntity.getProfit_margin());

        return sizeDetailsDTO;

    }

    public SizeInventoryDetailsEntity mapToSizeInventoryDetailEntity(SizeInventoryDetailsDTO sizeInventoryDetailsDTO) {
        SizeInventoryDetailsEntity sizeInventoryDetailsEntity = new SizeInventoryDetailsEntity();

        sizeInventoryDetailsEntity.setId(sizeInventoryDetailsDTO.getId());
        sizeInventoryDetailsEntity.setSize_code(mapToSizeEntity(sizeInventoryDetailsDTO.getSize()));
        sizeInventoryDetailsEntity.setItem_code(mapToInventoryEntity(sizeInventoryDetailsDTO.getInventory()));
        sizeInventoryDetailsEntity.setStatus(sizeInventoryDetailsDTO.getStatus());
        sizeInventoryDetailsEntity.setQty(sizeInventoryDetailsDTO.getQty());
        sizeInventoryDetailsEntity.setBuying_price(sizeInventoryDetailsDTO.getBuying_price());
        sizeInventoryDetailsEntity.setSelling_price(sizeInventoryDetailsDTO.getSelling_price());
        sizeInventoryDetailsEntity.setExpected_profit(sizeInventoryDetailsDTO.getExpected_profit());
        sizeInventoryDetailsEntity.setProfit_margin(sizeInventoryDetailsDTO.getProfit_margin());

        return sizeInventoryDetailsEntity;
    }

    public List<ReturnEntity> mapToReturnEntityList(List<ReturnDTO> returnDTO) {
        return returnDTO.stream().map(hotel -> modelMapper.map(hotel, ReturnEntity.class)).collect(Collectors.toList());
    }

    public List<UserDTO> toUserDTOs(List<UserEntity> all) {
        return all.stream().map(hotel -> modelMapper.map(hotel, UserDTO.class)).collect(Collectors.toList());
    }*//*

}
*/
package lk.ijse.Crop_monitoring_system_backend.util.map;

import lk.ijse.Crop_monitoring_system_backend.dto.EmployeeDTO;
import lk.ijse.Crop_monitoring_system_backend.dto.FieldDTO;
import lk.ijse.Crop_monitoring_system_backend.entity.FieldEntity;
import lk.ijse.Crop_monitoring_system_backend.entity.EmployeeEntity;
import lombok.RequiredArgsConstructor;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class Mapping {
    private final ModelMapper modelMapper;

    public EmployeeDTO mapToEmployeeDTO(EmployeeEntity employeeEntity) {
        if (employeeEntity == null) {
            return null;
        }

        EmployeeDTO employeeDTO = new EmployeeDTO();
        employeeDTO.setId(employeeEntity.getId());
        employeeDTO.setFirst_name(employeeEntity.getFirst_name());
        employeeDTO.setLast_name(employeeEntity.getLast_name());
        employeeDTO.setDesignation(employeeEntity.getDesignation());
        employeeDTO.setGender(employeeEntity.getGender());
        employeeDTO.setJoined_date(employeeEntity.getJoined_date());
        employeeDTO.setDOB(employeeEntity.getDOB());
        employeeDTO.setAddress_line_01(employeeEntity.getAddress_line_01());
        employeeDTO.setAddress_line_02(employeeEntity.getAddress_line_02());
        employeeDTO.setAddress_line_03(employeeEntity.getAddress_line_03());
        employeeDTO.setAddress_line_04(employeeEntity.getAddress_line_04());
        employeeDTO.setAddress_line_05(employeeEntity.getAddress_line_05());
        employeeDTO.setContact_no(employeeEntity.getContact_no());
        employeeDTO.setEmail(employeeEntity.getEmail());
        employeeDTO.setRole(employeeEntity.getRole());
        employeeDTO.setField(employeeEntity.getField());
        employeeDTO.setVehicle(employeeEntity.getVehicle());

        return employeeDTO;
    }

    public EmployeeEntity mapToEmployeeEntity(EmployeeDTO employeeDTO) {
        if (employeeDTO == null) {
            return null;
        }

        EmployeeEntity employeeEntity = new EmployeeEntity();
        employeeEntity.setId(employeeDTO.getId());
        employeeEntity.setFirst_name(employeeDTO.getFirst_name());
        employeeEntity.setLast_name(employeeDTO.getLast_name());
        employeeEntity.setDesignation(employeeDTO.getDesignation());
        employeeEntity.setGender(employeeDTO.getGender());
        employeeEntity.setJoined_date(employeeDTO.getJoined_date());
        employeeEntity.setDOB(employeeDTO.getDOB());
        employeeEntity.setAddress_line_01(employeeDTO.getAddress_line_01());
        employeeEntity.setAddress_line_02(employeeDTO.getAddress_line_02());
        employeeEntity.setAddress_line_03(employeeDTO.getAddress_line_03());
        employeeEntity.setAddress_line_04(employeeDTO.getAddress_line_04());
        employeeEntity.setAddress_line_05(employeeDTO.getAddress_line_05());
        employeeEntity.setContact_no(employeeDTO.getContact_no());
        employeeEntity.setEmail(employeeDTO.getEmail());
        employeeEntity.setRole(employeeDTO.getRole());
        employeeEntity.setField(employeeDTO.getField());
        employeeEntity.setVehicle(employeeDTO.getVehicle());

        return employeeEntity;
    }

    public FieldDTO mapToFieldDTO(FieldEntity fieldEntity) {
        if (fieldEntity == null) {
            return null;
        }

        FieldDTO fieldDTO = new FieldDTO();
        fieldDTO.setFieldCode(fieldEntity.getField_code());
        fieldDTO.setFieldName(fieldEntity.getField_name());

        if (fieldEntity.getField_location() != null) {
            fieldDTO.setLatitude(fieldEntity.getField_location().getLatitude());
            fieldDTO.setLongitude(fieldEntity.getField_location().getLongitude());
        }

        fieldDTO.setExtentSize(fieldEntity.getExtent_size_of_the_Field());
        fieldDTO.setCrops(fieldEntity.getCrops());
        fieldDTO.setStaff(fieldEntity.getStaff());
        fieldDTO.setFieldImage1(fieldEntity.getField_image1());
        fieldDTO.setFieldImage2(fieldEntity.getField_image2());

        return fieldDTO;
    }

    public FieldEntity mapToFieldEntity(FieldDTO fieldDTO) {
        if (fieldDTO == null) {
            return null;
        }

        FieldEntity fieldEntity = new FieldEntity();
        fieldEntity.setField_code(fieldDTO.getFieldCode());
        fieldEntity.setField_name(fieldDTO.getFieldName());

        // Create and set field location
        FieldEntity.Point point = fieldEntity.new Point();
        point.setLatitude(fieldDTO.getLatitude());
        point.setLongitude(fieldDTO.getLongitude());
        fieldEntity.setField_location(point);

        fieldEntity.setExtent_size_of_the_Field(fieldDTO.getExtentSize());
        fieldEntity.setCrops(fieldDTO.getCrops());
        fieldEntity.setStaff(fieldDTO.getStaff());
        fieldEntity.setField_image1(fieldDTO.getFieldImage1());
        fieldEntity.setField_image2(fieldDTO.getFieldImage2());

        return fieldEntity;
    }

    public List<EmployeeDTO> mapToEmployeeDTOList(List<EmployeeEntity> employeeEntities) {
        if (employeeEntities == null) {
            return null;
        }
        return employeeEntities.stream()
                .map(this::mapToEmployeeDTO)
                .collect(Collectors.toList());
    }

    public List<FieldDTO> mapToFieldDTOList(List<FieldEntity> fieldEntities) {
        if (fieldEntities == null) {
            return null;
        }
        return fieldEntities.stream()
                .map(this::mapToFieldDTO)
                .collect(Collectors.toList());
    }

    public List<EmployeeEntity> mapToEmployeeEntities(List<EmployeeDTO> employeeDTOs) {
        if (employeeDTOs == null) {
            return null;
        }
        return employeeDTOs.stream()
                .map(this::mapToEmployeeEntity)
                .collect(Collectors.toList());
    }

    public List<FieldEntity> mapToFieldEntities(List<FieldDTO> fieldDTOs) {
        if (fieldDTOs == null) {
            return null;
        }
        return fieldDTOs.stream()
                .map(this::mapToFieldEntity)
                .collect(Collectors.toList());
    }
}