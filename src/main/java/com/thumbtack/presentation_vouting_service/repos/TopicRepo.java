package com.thumbtack.presentation_vouting_service.repos;

import com.thumbtack.presentation_vouting_service.model.presentation.Topic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TopicRepo extends JpaRepository<Topic, String> {
}
