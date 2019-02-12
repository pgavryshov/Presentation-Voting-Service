package com.thumbtack.presentation_vouting_service.repository;

import com.thumbtack.presentation_vouting_service.model.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
}
