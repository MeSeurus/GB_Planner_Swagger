package com.planner.web.core.services;

import com.planner.web.core.entities.Day;
import com.planner.web.core.repositories.DayRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DayService {

    private final DayRepository dayRepository;

    public List<Day> findAll() {
        return dayRepository.findAll();
    }

    public Optional<Day> findById(Long id) {
        return dayRepository.findById(id);
    }

    public void createNew(Day day) {
        dayRepository.save(day);
    }

    public void deleteById(Long id) {
        dayRepository.deleteById(id);
    }
}
