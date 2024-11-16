/*
package lk.ijse.Crop_monitoring_system_backend.util.convert;



import lk.ijse.Crop_monitoring_system_backend.dto.EmployeeDTO;
import lk.ijse.Crop_monitoring_system_backend.dto.FieldDTO;
import lk.ijse.Crop_monitoring_system_backend.entity.EmployeeEntity;
import lk.ijse.Crop_monitoring_system_backend.entity.FieldEntity;
import lombok.RequiredArgsConstructor;
import org.modelmapper.spi.Mapping;
import org.springframework.stereotype.Component;

import java.awt.*;

@Component
@RequiredArgsConstructor
public class Converter {

    private Mapping mapping;

    //set customer dtos values to temCustomer entity
   */
/* public void convertCustomerEntity(CustomerDTO customerDTO, CustomerEntity tmpCustomerEntity) {
        tmpCustomerEntity.setCustomer_code(customerDTO.getCustomer_code());
        tmpCustomerEntity.setName(customerDTO.getName());
        tmpCustomerEntity.setGender(customerDTO.getGender());
        tmpCustomerEntity.setDate(customerDTO.getDate());
        tmpCustomerEntity.setLevel(customerDTO.getLevel());
        tmpCustomerEntity.setPoint(customerDTO.getPoint());
        tmpCustomerEntity.setDob(customerDTO.getDob());
        tmpCustomerEntity.setBuilding_number(customerDTO.getBuilding_number());
        tmpCustomerEntity.setLane(customerDTO.getLane());
        tmpCustomerEntity.setCity(customerDTO.getCity());
        tmpCustomerEntity.setState(customerDTO.getState());
        tmpCustomerEntity.setPostal_code(customerDTO.getPostal_code());
        tmpCustomerEntity.setContact(customerDTO.getContact());
        tmpCustomerEntity.setEmail(customerDTO.getEmail());
        tmpCustomerEntity.setRecent_purchase(customerDTO.getRecent_purchase());

    }*//*


    //set supplier dtos values to temSupplier entity
   */
/* public void convertSupplierEntity(SupplierDTO supplierDTO, SupplierEntity tmpSupplierEntity) {
        tmpSupplierEntity.setSupplier_code(supplierDTO.getSupplier_code());
        tmpSupplierEntity.setName(supplierDTO.getName());
        tmpSupplierEntity.setCategory(supplierDTO.getCategory());
        tmpSupplierEntity.setBuilding_number(supplierDTO.getBuilding_number());
        tmpSupplierEntity.setLane(supplierDTO.getLane());
        tmpSupplierEntity.setCity(supplierDTO.getCity());
        tmpSupplierEntity.setState(supplierDTO.getState());
        tmpSupplierEntity.setPostal_code(supplierDTO.getPostal_code());
        tmpSupplierEntity.setCountry(supplierDTO.getCountry());
        tmpSupplierEntity.setMobile_contact(supplierDTO.getMobile_contact());
        tmpSupplierEntity.setLandline_contact(supplierDTO.getLandline_contact());
        tmpSupplierEntity.setEmail(supplierDTO.getEmail());

    }*//*


    //set employee entity values to temEmployee dto
    public void convertEmployeeEntity(EmployeeDTO employeeDTO, EmployeeEntity tmpEmployeeEntity) {
        tmpEmployeeEntity.setEmployee_code(employeeDTO.getEmployee_code());
        tmpEmployeeEntity.setName(employeeDTO.getName());
        tmpEmployeeEntity.setProfile_pic(employeeDTO.getProfile_pic());
        tmpEmployeeEntity.setGender(employeeDTO.getGender());
        tmpEmployeeEntity.setStatus(employeeDTO.getStatus());
        tmpEmployeeEntity.setDesignation(employeeDTO.getDesignation());
        tmpEmployeeEntity.setRole(employeeDTO.getRole());
        tmpEmployeeEntity.setDob(employeeDTO.getDob());
        tmpEmployeeEntity.setJoined_date(employeeDTO.getJoined_date());
        tmpEmployeeEntity.setBuilding_number(employeeDTO.getBuilding_number());
        tmpEmployeeEntity.setLane(employeeDTO.getLane());
        tmpEmployeeEntity.setCity(employeeDTO.getCity());
        tmpEmployeeEntity.setState(employeeDTO.getState());
        tmpEmployeeEntity.setPostal_code(employeeDTO.getPostal_code());
        tmpEmployeeEntity.setContact(employeeDTO.getContact());
        tmpEmployeeEntity.setEmail(employeeDTO.getEmail());
        tmpEmployeeEntity.setGuardian_name(employeeDTO.getGuardian_name());
        tmpEmployeeEntity.setGuardian_contact(employeeDTO.getGuardian_contact());
        tmpEmployeeEntity.setField(mapping.mapToFieldEntity(employeeDTO.getField()));

    }

    //set inventory entity values to temInventory dto
  */
/*  public void convertInventoryEntity(InventoryDTO inventoryDTO, InventoryEntity tmpInventoryEntity) {
        tmpInventoryEntity.setItem_code(inventoryDTO.getItem_code());
        tmpInventoryEntity.setItem_desc(inventoryDTO.getItem_desc());
        tmpInventoryEntity.setItem_pic(inventoryDTO.getItem_pic());
        tmpInventoryEntity.setOccasion(inventoryDTO.getOccasion());
        tmpInventoryEntity.setGender(inventoryDTO.getGender());
        tmpInventoryEntity.setVerities(inventoryDTO.getVerities());
        tmpInventoryEntity.setSupplier(mapping.mapToSupplierEntity(inventoryDTO.getSupplier()));
        tmpInventoryEntity.setCategory(inventoryDTO.getCategory());
        tmpInventoryEntity.setSize(inventoryDTO.getSize());
        tmpInventoryEntity.setSupplier_code(inventoryDTO.getSupplier_code());
        tmpInventoryEntity.setSupplier_name(inventoryDTO.getSupplier_name());
        tmpInventoryEntity.setBuying_price(inventoryDTO.getBuying_price());
        tmpInventoryEntity.setSelling_price(inventoryDTO.getSelling_price());
        tmpInventoryEntity.setExpected_profit(inventoryDTO.getExpected_profit());
        tmpInventoryEntity.setProfit_margin(inventoryDTO.getProfit_margin());
        tmpInventoryEntity.setStatus(inventoryDTO.getStatus());
        tmpInventoryEntity.setQty_on_hand(inventoryDTO.getQty_on_hand());
    }*//*


    //set return entity values to temReturn dto
  */
/*  public void convertReturnEntity(ReturnDTO returnDTO, ReturnEntity tmpReturnEntity) {
        tmpReturnEntity.setReturn_id(returnDTO.getReturn_id());
        tmpReturnEntity.setReturn_date(returnDTO.getReturn_date());
        tmpReturnEntity.setReason(returnDTO.getReason());

    }*//*


    //set sale entity values to temSale dto
   */
/* public void convertSaleEntity(SaleDTO saleDTO, SaleEntity tmpSaleEntity) {
        tmpSaleEntity.setOrder_id(saleDTO.getOrder_id());
        // tmpSaleEntity.setItem_code(saleDTO.getItem_code());
        tmpSaleEntity.setCustomer(mapping.mapToCustomerEntity(saleDTO.getCustomer()));
        // tmpSaleEntity.setItem_desc(saleDTO.getItem_desc());
        // tmpSaleEntity.setSize(saleDTO.getSize());
        // tmpSaleEntity.setUnit_price(saleDTO.getUnit_price());
        // tmpSaleEntity.setItem_qty(saleDTO.getItem_qty());
        tmpSaleEntity.setTotal_price(saleDTO.getTotal_price());
        tmpSaleEntity.setPurchase_date(saleDTO.getPurchase_date());
        tmpSaleEntity.setPayment_method(saleDTO.getPayment_method());
        tmpSaleEntity.setAdded_points(saleDTO.getAdded_points());
        tmpSaleEntity.setCashier_name(saleDTO.getCashier_name());
    }*//*


    //set size entity values to temSize dto
  */
/*  public void convertSizeEntity(SizeDTO sizeDTO, SizeEntity tmpSizeEntity) {
        tmpSizeEntity.setSize_code(sizeDTO.getSize_code());
        tmpSizeEntity.setSize(sizeDTO.getSize());
    }*//*


    //set size inventory details entity values to temSizeInventoryDetails dto
    public void convertFieldEntity(FieldDTO fieldDTO, FieldEntity fieldEntity) {
        fieldEntity.setField_code(fieldDTO.getFieldCode());
        fieldEntity.setField_name(fieldDTO.getFieldName());
        fieldEntity.setField_location(new Point(fieldDTO.getLatitude(), fieldDTO.getLongitude()));
        fieldEntity.setExtent_size_of_the_Field(fieldDTO.getExtentSize());
        fieldEntity.setCrops(fieldDTO.getCrops());
        fieldEntity.setStaff(fieldDTO.getStaff());
        fieldEntity.setField_image1(fieldDTO.getFieldImage1());
        fieldEntity.setField_image2(fieldDTO.getFieldImage2());
    }
}
*/
package lk.ijse.Crop_monitoring_system_backend.util.convert;

import lk.ijse.Crop_monitoring_system_backend.dto.EmployeeDTO;
import lk.ijse.Crop_monitoring_system_backend.dto.FieldDTO;
import lk.ijse.Crop_monitoring_system_backend.entity.EmployeeEntity;
import lk.ijse.Crop_monitoring_system_backend.entity.FieldEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class Converter {
    public void convertEmployeeEntity(EmployeeDTO employeeDTO, EmployeeEntity employeeEntity) {
        if (employeeDTO == null || employeeEntity == null) {
            throw new IllegalArgumentException("EmployeeDTO and EmployeeEntity cannot be null");
        }

        employeeEntity.setId(employeeDTO.getId());
        employeeEntity.setFirst_name(employeeDTO.getFirst_name());
        employeeEntity.setLast_name(employeeDTO.getLast_name());
        employeeEntity.setDesignation(employeeDTO.getDesignation());
        employeeEntity.setGender(employeeDTO.getGender());
        employeeEntity.setJoined_date(employeeDTO.getJoined_date());
        employeeEntity.setDOB(employeeDTO.getDOB());

        // Address fields
        employeeEntity.setAddress_line_01(employeeDTO.getAddress_line_01());
        employeeEntity.setAddress_line_02(employeeDTO.getAddress_line_02());
        employeeEntity.setAddress_line_03(employeeDTO.getAddress_line_03());
        employeeEntity.setAddress_line_04(employeeDTO.getAddress_line_04());
        employeeEntity.setAddress_line_05(employeeDTO.getAddress_line_05());

        // Contact information
        employeeEntity.setContact_no(employeeDTO.getContact_no());
        employeeEntity.setEmail(employeeDTO.getEmail());

        // Role and assignments
        employeeEntity.setRole(employeeDTO.getRole());

        // Collections
        if (employeeDTO.getField() != null) {
            employeeEntity.setField(employeeDTO.getField());
        }

        if (employeeDTO.getVehicle() != null) {
            employeeEntity.setVehicle(employeeDTO.getVehicle());
        }
    }


    public EmployeeDTO convertToEmployeeDTO(EmployeeEntity employeeEntity) {
        if (employeeEntity == null) {
            throw new IllegalArgumentException("EmployeeEntity cannot be null");
        }

        EmployeeDTO employeeDTO = new EmployeeDTO();

        employeeDTO.setId(employeeEntity.getId());
        employeeDTO.setFirst_name(employeeEntity.getFirst_name());
        employeeDTO.setLast_name(employeeEntity.getLast_name());
        employeeDTO.setDesignation(employeeEntity.getDesignation());
        employeeDTO.setGender(employeeEntity.getGender());
        employeeDTO.setJoined_date(employeeEntity.getJoined_date());
        employeeDTO.setDOB(employeeEntity.getDOB());

        // Address fields
        employeeDTO.setAddress_line_01(employeeEntity.getAddress_line_01());
        employeeDTO.setAddress_line_02(employeeEntity.getAddress_line_02());
        employeeDTO.setAddress_line_03(employeeEntity.getAddress_line_03());
        employeeDTO.setAddress_line_04(employeeEntity.getAddress_line_04());
        employeeDTO.setAddress_line_05(employeeEntity.getAddress_line_05());

        // Contact information
        employeeDTO.setContact_no(employeeEntity.getContact_no());
        employeeDTO.setEmail(employeeEntity.getEmail());

        // Role and assignments
        employeeDTO.setRole(employeeEntity.getRole());
        employeeDTO.setField(employeeEntity.getField());
        employeeDTO.setVehicle(employeeEntity.getVehicle());

        return employeeDTO;
    }


    public EmployeeEntity createEmployeeEntity(EmployeeDTO employeeDTO) {
        if (employeeDTO == null) {
            throw new IllegalArgumentException("EmployeeDTO cannot be null");
        }

        EmployeeEntity employeeEntity = new EmployeeEntity();
        convertEmployeeEntity(employeeDTO, employeeEntity);
        return employeeEntity;
    }

}

/*// Update existing entity
converter.convertEmployeeEntity(employeeDTO, existingEntity);

// Create new entity
EmployeeEntity newEntity = converter.createEmployeeEntity(employeeDTO);

// Convert entity to DTO
EmployeeDTO dto = converter.convertToEmployeeDTO(entity);*/