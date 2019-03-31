package eu.aevent.domain;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
public class Ranking {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    private User user;

    @ManyToOne
    private Event event;

    private int score;

    private LocalDateTime date;

    @ManyToOne
    private Task task;


    public Ranking() {
    }

    public Ranking(User user, Event event, int score, LocalDateTime date, Task task) {
        this.user = user;
        this.event = event;
        this.score = score;
        this.date = date;
        this.task = task;
    }

    @Override
    public String toString() {
        return "Ranking{" +
                "id=" + id +
                ", user=" + user +
                ", event=" + event +
                ", score=" + score +
                ", date=" + date +
                ", task=" + task +
                '}';
    }
}
