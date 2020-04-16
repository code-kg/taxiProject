package kg.ItAcademy.taxiProject.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table (name = "taxi")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Taxi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column (name = "phone_number", nullable = false)
    private Long phone;
}
