package com.thumbtack.presentation_vouting_service.model.employee;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    String id;
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
    List<Role> roleList;

}
