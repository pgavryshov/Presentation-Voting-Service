package com.thumbtack.presentation_vouting_service.model.employee;

import com.thumbtack.presentation_vouting_service.model.presentation.Presentation;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
public class Vote {
    String id;
    @Setter
    @Getter
    String advice;
    @Setter
    @Getter
    Employee user;
    @Setter
    @Getter
    Presentation presentation;
    @Setter
    @Getter
    VoteStatus status;
}
