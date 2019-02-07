package com.thumbtack.presentation_vouting_service.model.presentation;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
public class Topic {
    String id;
    @Getter
    @Setter
    String category;
    @Getter
    @Setter
    String goal;
    @Getter
    @Setter
    String targetAudienceRequirements;
}
