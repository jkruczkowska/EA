package eu.aevent.repository;

import eu.aevent.domain.Scenario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface ScenarioRepository extends JpaRepository<Scenario, Integer> {

    @Override
    List<Scenario> findAll();

    @Override
    Scenario getOne(Integer id);

    Scenario getByCreated(LocalDateTime localDateTime);

    Scenario getByScenarioName(String name);
}
