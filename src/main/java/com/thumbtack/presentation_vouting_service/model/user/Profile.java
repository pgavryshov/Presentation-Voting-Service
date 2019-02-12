package com.thumbtack.presentation_vouting_service.model.user;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
public class Profile {
    @Getter
    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    @Getter
    @Setter
    String firstName;
    @Getter
    @Setter
    String lastName;
    @Getter
    @Setter
    String skype;
    @Getter
    @Setter
    String email;
    @Getter
    @Setter
    String position;
    @Getter
    @Setter
    String photo;
    @Setter
    @Getter
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private User author;
}
