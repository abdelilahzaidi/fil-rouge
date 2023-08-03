package be.digitalicty.filrouge.business_layer.interfaces.intern;

import org.springframework.data.domain.Page;

import java.util.Optional;

public interface Intern {
    Page<Intern> findAll(int page, int offset);
    Optional<Intern> findOneById(int id);

    void insert(Intern intern, long workId);
}
