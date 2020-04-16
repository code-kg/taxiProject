package kg.ItAcademy.taxiProject.service;

import kg.ItAcademy.taxiProject.entity.Taxi;
import kg.ItAcademy.taxiProject.repository.TaxiRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TaxiServiceImpl implements TaxiService {
    @Autowired
    private TaxiRepository taxiRepository;
    @Override
    public List<Taxi> getAll() {
        return taxiRepository.findAll();
    }
    @Override
    public Taxi create(Taxi taxi) {
        return taxiRepository.save(taxi);
    }

    @Override
    public Taxi getById(Long id) {
        return taxiRepository.findById(id).orElse(null) ;
    }

    @Override
    public Taxi update(Taxi taxi) {
        return taxiRepository.save(taxi);
    }

    @Override
    public void deleteById(Long id) {
        taxiRepository.deleteById(id);
    }
}
