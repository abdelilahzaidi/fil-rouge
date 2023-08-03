package be.digitalicty.filrouge.data_access_layer.entities;


import jakarta.persistence.*;
import lombok.Data;

import javax.annotation.processing.Generated;

@Entity
@Table(name="intern",schema = "red_thread")
@Data
public class Intern {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    @Column(name="first_name", nullable=false)
    private String firstName;

    @Column(name="last_name", nullable=false)
    private String lastName;

    @ManyToOne
    private Work work;
}
