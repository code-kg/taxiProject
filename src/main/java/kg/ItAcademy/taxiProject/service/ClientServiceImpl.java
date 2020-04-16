package kg.ItAcademy.taxiProject.service;

import kg.ItAcademy.taxiProject.entity.Client;
import kg.ItAcademy.taxiProject.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ClientServiceImpl implements ClientService {
    @Autowired
    private ClientRepository clientRepository;
    @Override
    public List<Client> getAll() {
        return clientRepository.findAll();
    }

    @Override
    public Client creat(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public Client getById(Long id) {
        return clientRepository.findById(id).orElse(null);
    }

    @Override
    public Client update(Client customer) {
        return null;
    }

    @Override
    public void deleteById(Long id) {
        clientRepository.deleteById(id);
    }
}
