package kg.ItAcademy.taxiProject.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "customer")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "phone",nullable = false,unique = true)
    private Long phone;
    @ManyToOne
    @JoinColumn(name = "taxi",nullable = false)
    private Taxi taxi;
}
