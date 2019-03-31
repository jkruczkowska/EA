package eu.aevent.domain;


import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Data
@Entity
public class Scenario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String scenarioName;

    private String description;

    private LocalDate created;

    @OneToMany
    private List<Event> events;


    public Scenario() {
    }

    public Scenario(String scenario_name, String description, LocalDate created) {
        this.scenarioName = scenario_name;
        this.description = description;
        this.created = created;
    }

    @Override
    public String toString() {
        return "Scenario{" +
                "id=" + id +
                ", scenario_name='" + scenarioName + '\'' +
                ", description='" + description + '\'' +
                ", created=" + created +
                '}';
    }
}
