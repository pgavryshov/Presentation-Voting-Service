package com.thumbtack.presentation_vouting_service.repos;

import com.thumbtack.presentation_vouting_service.model.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, String> {
    User findByUsername(String username);
}
