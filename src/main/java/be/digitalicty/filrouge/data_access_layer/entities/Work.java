package be.digitalicty.filrouge.data_access_layer.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name="work",schema = "red_thread")
public class Work {


    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    @Column(name="date_work",nullable=false)
    private LocalDate dateTravail;
    @Column(name="duration",nullable=false)
    private LocalDate duration;

    @ElementCollection()
    private ArrayList<String> photos=new ArrayList<String>();

    @Column(name="comment",nullable=false)
    private String commentaire;

    @OneToMany(targetEntity = Intern.class, mappedBy="work")
    private List<Intern> interns;
}
