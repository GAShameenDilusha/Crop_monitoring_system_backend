package lk.ijse.Crop_monitoring_system_backend.controller;

import java.util.List;

public interface EmployeeController<ID,T> extends SuperController{
    public boolean saveEmployee(T employeeDTO);
    public boolean updateEmployee(T employeeDTO);
    public boolean deleteEmployee(ID employee_code);
    public T searchEmployee(ID employee_code);
    public List<T> getAllEmployees();
}
