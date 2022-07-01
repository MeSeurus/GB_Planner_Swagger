package com.planner.web.core.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data
@Table(name = "days")
@AllArgsConstructor
public class Day {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "date")
    private Date date;

    @Column(name = "weekday")
    private String weekday;

    @JoinColumn(name = "event_id")
    @OneToMany(mappedBy = "day")
    private List<Event> events;

    public Day() {
    }
}
