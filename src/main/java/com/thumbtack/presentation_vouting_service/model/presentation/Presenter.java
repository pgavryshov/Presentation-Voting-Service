package com.thumbtack.presentation_vouting_service.model.presentation;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
public class Presenter {
    @Getter
    @Setter
    String role;
    @Getter
    @Setter
    Presentation presentation;
}
