package com.planner.web.core.repositories;

import com.planner.web.core.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

     public Optional<User> findUserByNickname(String nickname);

     @Query(value = "select u from User u join fetch u.events")
     public Optional<User> findUserByNicknameWithEvents(String nickname);

     @Query(value = "select * from users" +
             " left join users_events on users.id = users_events.user_id" +
             " left join events on users_events.event_id = events.id",
             nativeQuery = true)
     public List<User> findAll();
}
