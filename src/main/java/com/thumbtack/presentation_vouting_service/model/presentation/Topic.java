package com.thumbtack.presentation_vouting_service.model.presentation;

import com.thumbtack.presentation_vouting_service.model.user.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

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
    @Setter
    @Getter
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private User author;
}
