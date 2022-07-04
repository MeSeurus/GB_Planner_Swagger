package com.planner.web.core.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data
@Table(name = "days")
@AllArgsConstructor
@NoArgsConstructor
public class Day {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "cur_date")
    private Date date;

    @Column(name = "weekday")
    private String weekday;

    @OneToMany(mappedBy = "day", cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    private List<Event> events;

    public Day(Long id, Date date, String weekday) {
        this.id = id;
        this.date = date;
        this.weekday = weekday;
    }
}
