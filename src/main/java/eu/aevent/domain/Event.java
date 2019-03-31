package eu.aevent.domain;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToMany
    private List<User> users;

    private LocalDateTime date;

    private String description;

    @ManyToMany
    @JoinColumn
    private List<Task> tasks;

    @Column(name = "name")
    private String eventName;

    @ManyToOne
    @JoinColumn
    private Scenario scenario;

}
