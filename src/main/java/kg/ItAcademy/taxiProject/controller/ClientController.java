package kg.ItAcademy.taxiProject.controller;

import kg.ItAcademy.taxiProject.entity.Client;
import kg.ItAcademy.taxiProject.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {
    @Autowired
    private ClientService clientService;

    @GetMapping
    public List<Client> getAll(){
        return clientService.getAll();
    }
    @GetMapping("/{id}")
    public Client getById(@PathVariable Long id){
        return clientService.getById(id);
    }
    @PostMapping
    public Client create (@RequestBody Client client){
        return clientService.creat(client);
    }
    @PutMapping
    public Client update(@RequestBody Client client){
        return clientService.update(client);
    }
   // @DeleteMapping("/{id}")
    public void deletById(@PathVariable Long id){
        clientService.deleteById(id);
    }

}
