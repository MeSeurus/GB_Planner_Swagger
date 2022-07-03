package com.planner.web.core.repositories;

import com.planner.web.core.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

     Optional<User> findUserByNickname(String nickname);
     List<User> findAll();
     void deleteByNickname(String nickname);

     // пока не работает
     @Query(value = "insert into users_events (user_id, event_id) " +
             "values (:userId, :eventId)",
             nativeQuery = true)
     void takeEvent(@Param("userId") Long userId,@Param("eventId") Long eventId);
}
