package eu.aevent.repository;

import eu.aevent.domain.Beacon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BeaconRepository extends JpaRepository<Beacon, Integer> {

    @Override
    List<Beacon> findAll();

    @Override
    Beacon getOne(Integer integer);

    Beacon getByName(String name);
}
