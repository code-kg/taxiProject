package kg.ItAcademy.taxiProject.service;

import kg.ItAcademy.taxiProject.entity.Client;


import java.util.List;

public interface ClientService {
    List<Client> getAll();
    Client creat (Client customer);
    Client getById(Long id);
    Client update(Client customer);
    void deleteById(Long id);
}
