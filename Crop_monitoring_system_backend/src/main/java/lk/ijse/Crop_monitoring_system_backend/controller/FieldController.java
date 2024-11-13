package lk.ijse.Crop_monitoring_system_backend.controller;

import java.util.List;

public interface FieldController<ID,T> extends SuperController{
    public boolean saveField(T fieldDTO);
    public boolean updateField(T fieldDTO);
    public boolean deleteField(ID field_code);
    public T searchField(ID field_code);
    public List<T> getAllFieldes();
}
