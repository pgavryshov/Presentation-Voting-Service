package com.thumbtack.presentation_vouting_service.model.presentation;

import com.thumbtack.presentation_vouting_service.model.user.Feedback;
import com.thumbtack.presentation_vouting_service.model.user.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
public class Presentation {
    String id;
    @Getter
    @Setter
    String name;
    @Getter
    @Setter
    Topic topic;
    @Getter
    @Setter
    String stream;
    @Getter
    @Setter
    String video;
    @Setter
    @Getter
    List<Presenter> presenters;
    @Setter
    @Getter
    User author;
    @Getter
    @Setter
    List<Feedback> feedbackList;
    @Getter
    @Setter
    LocalDateTime creationTime;
    @Getter
    @Setter
    LocalDateTime presentationTime;
    @Setter
    @Getter
    LocalDateTime startVotingTime;
    @Getter
    @Setter
    LocalDateTime endVotingTime;
    @Getter
    @Setter
    PresentationStatus presentationStatus;
    Set<Feedback> feedbackSet;
}
