package be.digitalicty.filrouge.business_layer.services.intern;

import be.digitalicty.filrouge.business_layer.interfaces.intern.Intern;
import org.springframework.data.domain.Page;

import java.util.Optional;

public class internService implements Intern {

    @Override
    public Page<Intern> findAll(int page, int offset) {
        return null;
    }

    @Override
    public Optional<Intern> findOneById(int id) {
        return Optional.empty();
    }

    @Override
    public void insert(Intern intern, long workId) {

    }
}
