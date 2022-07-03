package com.planner.web.core.repositories;

import com.planner.web.core.entities.Event;
import com.planner.web.core.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import java.util.List;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {

    @Query(
            value = "SELECT e from Event e where e.day.id = :id"
    )
    public List<Event> findAllByDayId(@Param("id") Long id);

    public List<Event> findEventsByUsers(User username);

}
