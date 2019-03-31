package eu.aevent.repository;

import eu.aevent.domain.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventRepository extends JpaRepository<Event, Integer> {

    @Override
    List<Event> findAll();

    @Override
    Event getOne(Integer id);

    Event getByEventName(String name);
}
