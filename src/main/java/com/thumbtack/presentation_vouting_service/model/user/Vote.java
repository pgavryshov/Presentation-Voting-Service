package com.thumbtack.presentation_vouting_service.model.user;

import com.thumbtack.presentation_vouting_service.model.presentation.Presentation;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
public class Vote {
    Long id;
    @Setter
    @Getter
    String advice;
    @Setter
    @Getter
    User user;
    @Setter
    @Getter
    Presentation presentation;
    @Setter
    @Getter
    VoteStatus status;
}
