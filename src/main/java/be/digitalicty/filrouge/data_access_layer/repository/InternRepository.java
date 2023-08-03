package be.digitalicty.filrouge.data_access_layer.repository;

import be.digitalicty.filrouge.data_access_layer.entities.Intern;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InternRepository extends JpaRepository<Intern,Integer> {
}
