package kg.ItAcademy.taxiProject.repository;

import kg.ItAcademy.taxiProject.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client,Long> {
}
