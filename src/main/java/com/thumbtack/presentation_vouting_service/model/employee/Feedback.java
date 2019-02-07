package com.thumbtack.presentation_vouting_service.model.employee;

import com.thumbtack.presentation_vouting_service.model.presentation.Presentation;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
public class Feedback {
    String id;
    @Getter
    @Setter
    String test;
    @Getter
    @Setter
    Employee author;
    @Getter
    @Setter
    Presentation presentation;
}
