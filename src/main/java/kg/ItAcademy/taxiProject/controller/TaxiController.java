package kg.ItAcademy.taxiProject.controller;

import kg.ItAcademy.taxiProject.entity.Taxi;
import kg.ItAcademy.taxiProject.service.TaxiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/taxi")
public class TaxiController {
    @Autowired
    private TaxiService taxiService;
    @GetMapping
    public List<Taxi> getAll(){
        return taxiService.getAll();
    }
    @GetMapping("/{id}")
    public Taxi getById (@PathVariable Long id){
        return taxiService.getById(id);
    }
    @PostMapping
    public Taxi create (@RequestBody Taxi taxi){
        return taxiService.create(taxi);
    }
    @PutMapping
    public Taxi update(@RequestBody Taxi taxi){
        return taxiService.update(taxi);
    }
    @DeleteMapping("/{id}")
    public void deletById(@PathVariable Long id){
        taxiService.deleteById(id);
    }
}
