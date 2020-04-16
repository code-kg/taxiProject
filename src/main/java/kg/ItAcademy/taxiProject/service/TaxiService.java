package kg.ItAcademy.taxiProject.service;

import kg.ItAcademy.taxiProject.entity.Taxi;

import java.util.List;

public interface TaxiService {
    List<Taxi>getAll();
    Taxi create(Taxi taxi);
    Taxi getById(Long id);
    Taxi update(Taxi taxi);
    void deleteById(Long id);
}
