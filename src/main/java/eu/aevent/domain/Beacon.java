package eu.aevent.domain;


import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Beacon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @Column(name = "mac_address")
    private String macAddress;

    private String location;

    private int signalRange;

    private int signalStrength;

    @OneToMany
    private List<Task> tasks;

}
