package kg.ItAcademy.taxiProject.repository;

import kg.ItAcademy.taxiProject.entity.Taxi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaxiRepository extends JpaRepository<Taxi, Long> {

}
