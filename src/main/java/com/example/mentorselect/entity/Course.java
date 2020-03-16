package com.example.mentorselect.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int lowestScore;
    private float weight;
    @OneToMany(mappedBy = "course")
    private List<CourseSelect> courseSelects;
}
