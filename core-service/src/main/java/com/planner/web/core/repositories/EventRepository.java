package com.planner.web.core.repositories;

import com.planner.web.core.entities.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {

    public List<Event> findAllByDay(Long id);

    public List<Event> findAllByUserNames(String username);

}
