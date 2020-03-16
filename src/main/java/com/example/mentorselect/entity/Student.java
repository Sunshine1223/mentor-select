package com.example.mentorselect.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.scheduling.config.ScheduledTask;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
public class Student {
    @Id
    private int id;
    private String name;
    @OneToMany(mappedBy = "student")
    private List<CourseSelect> courseSelects;
    @ManyToOne
    private Teacher teacher;

}
